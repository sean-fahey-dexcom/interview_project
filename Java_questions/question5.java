package Java_questions;
import java.util.Map;
import java.util.HashMap;



public class question5 {
    public static void main(String[] args) {
        // Goal: You are given a random string of length 10 containing ONLY the
        // letters a, b, c, d, and e. Find which letter appears the most AND
        // how many times it appears.

        // Steps:
        //   1. Loop through the string and count how many times each letter
        //      appears.
        //   2. Save the letter that appears to the variable mostFrequentChar.
        //   3. Save the number of times it appears to the variable maxFrequency.

        // Note: For this question, I have given you the starting code. Add to
        // the code below to complete the problem.

        String randomString = randomString(10);

        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        // Option 1: Use a HashMap to count the frequency of each character,
        //           using .getOrDefault() to set the value.
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char character : randomString.toCharArray()) {
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }

        for (Map.Entry<Character, Integer> item : frequencyMap.entrySet()) {
            Character key = item.getKey();
            Integer value = item.getValue();

            if (value > maxFrequency) {
                maxFrequency = value;
                mostFrequentChar = key;
            }
        }


        // Option 2: Use an array to count the frequency of each character.
        int[] counts = new int[5]; // Index 0 = 'a', 1 = 'b', 2 = 'c', 3 = 'd', 4 = 'e'
        for (char character : randomString.toCharArray()) {
            if (character == 'a') {
                counts[0]++;
            } else if (character == 'b') {
                counts[1]++;
            } else if (character == 'c') {
                counts[2]++;
            } else if (character == 'd') {
                counts[3]++;
            } else if (character == 'e') {
                counts[4]++;
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxFrequency) {
                maxFrequency = counts[i];
                mostFrequentChar = (char) ('a' + i); // Convert index back to character
            }
        }


        // Option 3: Use nested loops to count the frequency of each character.
        //           Much less efficient, but works.
        for (char character : new char[] {'a', 'b', 'c', 'd', 'e'}) {
            int count = 0;
            for (char c : randomString.toCharArray()) {
                if (c == character) {
                    count++;
                }
            }
            if (count > maxFrequency) {
                maxFrequency = count;
                mostFrequentChar = character;
            }
        }


        System.out.println("Question 5 - Most Frequent Character");
        System.out.println("    The random string is: " + randomString);
        System.out.println("    Most frequent character: " + mostFrequentChar);
        System.out.println("    It appears " + maxFrequency + " times.");
    }

    private static String randomString(int length) {
        // Helper method that generates a random string of the specified length
        // containing only the letters a, b, c, d, and e.
        String[] letters = {"a", "b", "c", "d", "e"};
        StringBuilder myString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * letters.length);
            myString.append(letters[randomIndex]);
        }
        return myString.toString();
    }
}
