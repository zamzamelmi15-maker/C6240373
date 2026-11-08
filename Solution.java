package StacksDemo;

public class Solution {

    // Main Assignment: Reverse Array
    public static int[] reverseArray(int[] numbers) {

        // Step 1: Create ArrayStack with initial capacity 2
        ArrayStack<Integer> stack = new ArrayStack<>(2);

        // Step 2: Push all numbers into the stack
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        // Step 3: Create a new array
        int[] reversed = new int[numbers.length];

        // Step 4: Pop elements into the new array
        int i = 0;

        while (!stack.isEmpty()) {
            reversed[i] = stack.pop();
            i++;
        }

        // Step 5: Return reversed array
        return reversed;
    }


    // Bonus Challenge: Reverse first K elements
    public static int[] reverseFirstK(int[] numbers, int k) {

        if (k < 0 || k > numbers.length) {
            throw new IllegalArgumentException("Invalid K");
        }

        ArrayStack<Integer> stack = new ArrayStack<>(2);

        int[] result = numbers.clone();

        // Push first K elements
        for (int i = 0; i < k; i++) {
            stack.push(numbers[i]);
        }

        // Pop elements into the first K positions
        for (int i = 0; i < k; i++) {
            result[i] = stack.pop();
        }

        return result;
    }


    // Main Method
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        int[] reversed = reverseArray(numbers);

        System.out.println("Reversed Array:");

        for (int num : reversed) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Bonus
        int[] bonus = reverseFirstK(numbers, 3);

        System.out.println("Bonus Output:");

        for (int num : bonus) {
            System.out.print(num + " ");
        }
    }
}
