package Java_questions;


public class question4 {
    public static void main(String[] args) {
        // Goal: Given a random string, determine if it is a palindrome. A 
        // palindrome is a word that reads the same backward as forward like
        // "racecar" or "level".
        
        // Steps:
        //  1. Loop through the string and compare the first character to the
        //     last character.
        //  2. If they are the same, continue to the next character inward and
        //     compare again.
        //  3. If all characters match, the string is a palindrome. If any 
        //     characters do not match, the string is NOT a palindrome

        String word = wordSelector();
        boolean isPalindrome = true;

        // Your code here ↓↓↓↓




        // ↑↑↑↑ Your code goes above

        System.out.println("Question 4 - Palindrome Checker");
        System.out.println("    The word is: " + word);
        System.out.println("    Is palindrome: " + isPalindrome);
    }

    private static String wordSelector() {
        // Helper method that returns a random word from the list
        String[] words = {
            "racecar",      // palindrome
            "level",        // palindrome
            "stats",        // palindrome
            "java",
            "Dexcom",
            "noon",         // palindrome
            "palindrome",
            "radar",        // palindrome
            "civic",        // palindrome
            "testing",
            "kayak",        // palindrome
        };
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }
}
