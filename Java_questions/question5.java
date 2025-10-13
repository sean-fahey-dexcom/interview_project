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

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char character : randomString.toCharArray()) {
            // Add each character to the map or update its count
            // Your code here ↓↓↓↓




            // ↑↑↑↑ Your code goes above
        }

        for (Map.Entry<Character, Integer> item : frequencyMap.entrySet()) {
            Character key = item.getKey();
            Integer value = item.getValue();

            // Find the highest frequency and corresponding character
            // Your code here ↓↓↓↓




            // ↑↑↑↑ Your code goes above
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
