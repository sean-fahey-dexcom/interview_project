package Java_tests;

import java.util.Arrays;
import java.util.Random;


public class question1 {

    public static void main(String[] args) {
        // Goal: Count how many ODD numbers are in a randomly generated array
        // of integers.
        //
        // Steps:
        //   1. Loop through the array and check each number one at a time. If
        //      the number is odd, add 1 to the oddCount variable.
        int[] numbers = numberGenerator(10, 1, 100);
        int oddCount = 0;

        // your code here ----




        // Print the result
        System.out.println("Question 1 - Odd Count");
        System.out.println("    Numbers: " + Arrays.toString(numbers));
        System.out.println("    Odd Count: " + oddCount);
    }
    

    private static Boolean isOdd(int number) {
        // Helper method that checks if a number is odd
        boolean result = number % 2 != 0;
        return result;
    }

    private static int[] numberGenerator(int size, int min, int max) {
        // Helper method that generates an array of random integers
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }
        return numbers;
    }
}
