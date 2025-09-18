import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1 - Odd Count: " + question1());
        System.out.println();

        System.out.println("Question 2 - Most Frequent Letter: " + question2());
        System.out.println();
    }

    public static int question1() {
        // Goal: Count how many ODD numbers are in a randomly generated array
        // of integers.
        // 
        // Steps:
        //   1. Generate an array of random integers
        //   2. Loop through the array and count how many ODD numbers are present
        //   3. Save this to the variable oddCount

        int oddCount = 0;

        // Step 1
        RandomNumberGenerator rng = new RandomNumberGenerator();
        int[] numbers = rng.generateRandomArray(10, 1, 100);
        System.out.println("Random numbers: " + Arrays.toString(numbers));

        // Step 2 & 3 - your code here
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount;
    }

    public static String question2() {
        // Goal: Generate a random string of length 100 containing only the
        // letters a, b, c, d, and e. Find which letter appears the most AND
        // how many times it appears.
        // 
        // Steps:
        //   1. Generate a random string of length 100 containing only the
        //      letters a, b, c, d, and e.
        //   2. Loop through the string and count how many times each letter
        //      appears.
        //   3. Save the letter that appears to the variable mostFrequentChar.
        //   4. Save the number of times it appears to the variable maxFrequency.
        
        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        // Step 1
        RandomStringGenerator rwg = new RandomStringGenerator();
        String randomString = rwg.generateRandomString(10);
        System.out.println("Random string: " + randomString);

        // Step 2, 3, & 4 - your code here
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char character : randomString.toCharArray()) {
            // add the character to the map or update its count
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        for (Map.Entry<Character, Integer> item : frequencyMap.entrySet()) {
            // Find the highest frequency and corresponding character
            if (item.getValue() > maxFrequency) {
                maxFrequency = item.getValue();
                mostFrequentChar = item.getKey();
            }
        }

        return mostFrequentChar + ": " + maxFrequency;
    }

    static class RandomNumberGenerator {
        // Generates an array of random integers
        private Random random = new Random();
        
        public int[] generateRandomArray(int size, int min, int max) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(max - min + 1) + min;
            }
            return array;
        }
    }

    static class RandomStringGenerator {
        // Generates a random string of specified length containing only the
        // letters a, b, c, d, and e.
        private Random random = new Random();

        public String generateRandomString(int length) {
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < length; i++) {
                char randomChar = (char) ('a' + random.nextInt(5));
                word.append(randomChar);
            }
            return word.toString();
        }
    }
}
