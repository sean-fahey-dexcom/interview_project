package Java_questions;

import java.util.Random;


public class question2 {

    public static void main(String[] args) {
        // Goal: Check if a password is valid. A valid password must:
        //   1. Contain at least one uppercase letter
        //   2. Contain at least one number
        //   3. Be at least 8 characters long
        //
        // Steps:
        //   1. Check each character in the password to see if ANY character is
        //      uppercase. If true, set `hasUppercase` to true.
        //   2. Check each character in the password to see if ANY character is
        //      a number. If true, set `hasNumber` to true.
        //   3. Check if the password is at least 8 characters long. If true,
        //      set `isLongEnough` to true.

        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean isLongEnough = false;

        String password = passwordGenerator(1, 7, 1);

        // Examples on how to handle hasUppercase and hasNumber
        // Option 1: Loop through the password only once and check for both
        //           uppercase letters and numbers in the same loop.
        for (char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            }
            else if (Character.isDigit(character)) {
                hasNumber = true;
            }
        }


        // Option 2: Loop through the password twice, once for uppercase and
        //           once for numbers. Less efficient, but still works.
        for (char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            }
        }
        for (char character : password.toCharArray()) {
            if (Character.isDigit(character)) {
                hasNumber = true;
            }
        }


        // Option 3: Use regex (advanced)
        hasUppercase = password.matches(".*[A-Z].*");
        hasNumber = password.matches(".*[0-9].*");


        // Option 4: Modifying string on the uppercase check. This is very
        //           impressive!
        hasUppercase = !password.equals(password.toLowerCase());
        hasNumber = password.matches(".*[0-9].*");


        // Option 5: Using streams (advanced)
        hasUppercase = password.chars().anyMatch(c -> Character.isUpperCase(c));
        hasNumber = password.chars().anyMatch(c -> Character.isDigit(c));


        // Examples to check isLongEnough
        // There's really only one way to do this:
        isLongEnough = password.length() >= 8;


        boolean isValid = hasUppercase && hasNumber && isLongEnough;
        System.out.println("Question 2 - Password Validator");
        System.out.println("    Generated Password: " + password);
        System.out.println("        Has Uppercase:  " + hasUppercase);
        System.out.println("        Has Number:     " + hasNumber);
        System.out.println("        Is Long Enough: " + isLongEnough);
        System.out.println("        Is Valid:       " + isValid);
    }

    private static String passwordGenerator(int numUpper, int numLower, int numNumbers) {
        // Helper method that generates a random password
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Adds random UPPER CASE letters to the password
        for(int i = 0; i < numUpper; i++) {
            char randomUpperCase = (char) ('A' + random.nextInt(26));
            password.append(randomUpperCase);
        }

        // Adds random lower case letters to the password
        for (int i = 0; i < numLower; i++) {
            char randomLowerCase = (char) ('a' + random.nextInt(26));
            password.append(randomLowerCase);
        }

        // Adds random numbers to the password
        for (int i = 0; i < numNumbers; i++) {
            char randomNumber = (char) ('0' + random.nextInt(10));
            password.append(randomNumber);
        }

        return password.toString();
    }
}
