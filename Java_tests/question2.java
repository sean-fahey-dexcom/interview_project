package Java_tests;

import java.util.Random;


public class question2 {

    public static void main(String[] args) {
        // Goal: Check if a password is valid. A valid password must:
        //   1. Contain at least one uppercase letter
        //   2. Contain at least one lowercase letter
        //   3. Contain at least one number
        //   4. Be at least 8 characters long
        //
        // Steps:
        //   1. Check each character in the password to see if ANY character is
        //      uppercase. If true, set `hasUppercase` to true.
        //   2. Check each character in the password to see if ANY character is
        //      lowercase. If true, set `hasLowercase` to true.
        //   3. Check each character in the password to see if ANY character is
        //      a number. If true, set `hasNumber` to true.
        //   4. Check if the password is at least 8 characters long. If true,
        //      set `isLongEnough` to true.

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean isLongEnough = false;

        String password = passwordGenerator(1, 7, 1);

        // Your code here ----





        boolean isValid = hasLowercase && hasUppercase && hasNumber && isLongEnough;
        System.out.println("Question 2 - Password Validator");
        System.out.println("    Generated Password: " + password);
        System.out.println("        Has Uppercase:  " + hasUppercase);
        System.out.println("        Has Lowercase:  " + hasLowercase);
        System.out.println("        Has Number:     " + hasNumber);
        System.out.println("        Is Long Enough: " + isLongEnough);
        System.out.println();
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
