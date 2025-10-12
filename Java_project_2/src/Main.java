import java.util.*;


public class Main {
    public static void main(String[] args) {
        Generators.RandomNumber rng = new Generators.RandomNumber();
        int[] numbers = rng.generateRandomNumbers(10, 1, 100);
        System.out.println("Question 1 - Odd Count: " + question1(numbers));
        System.out.println();

        Generators.RandomPassword rpg = new Generators.RandomPassword();
        String password = rpg.generateRandomPassword();
        System.out.println("Question 2 - Is the password '" + password + "' valid?): " + question2(password));
        System.out.println();

        Integer temperature = new Random().nextInt(60) - 10;
        System.out.println("Question 3 - Weather Condition: " + question3(temperature));
        System.out.println();

        Generators.RandomString rwg = new Generators.RandomString();
        String randomString = rwg.generateRandomString(10);
        System.out.println("Question 4 - Most Frequent Letter: " + question4(randomString));
        System.out.println();
    }


    // ------------------------------ QUESTION 1 ------------------------------
    private static Boolean isOdd(int number) {
        // This is a helper method for question 1. If the number is odd, it
        // returns true. If even, it returns false.
        boolean result = number % 2 != 0;
        return result;
    }

    public static int question1(int[] numbers) {
        // Goal: Count how many ODD numbers are in a randomly generated array
        // of integers.
        // 
        // Steps:
        //   1. Loop through the array and check each number one at a time. If
        //      the number is odd, add 1 to the oddCount variable

        int oddCount = 0;
        System.out.println("Random numbers: " + Arrays.toString(numbers));

        // Step 1 - your code here

        // example using enhanced for loop <- This is basically what every AI tool will suggest
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddCount++;
            }
        }

        // example using traditional for loop
        // for (int i=0; i<numbers.length; i++) {
        //     if (numbers[i] % 2 != 0) {
        //         oddCount++;
        //     }
        // }

        // example using while loop <- AI will likely never suggest this answer
        // int i = 0;
        // while (i < numbers.length) {
        //     if (numbers[i] % 2 != 0) {
        //         oddCount++;
        //     }
        //     i++;
        // }

        // example using streams (bonus points for creativity!) <- Anyone who does this is an expert in Java. AI will never suggest this answer.
        // oddCount = (int) Arrays.stream(numbers).filter(n -> n % 2 != 0).count();

        return oddCount;
        }


    // ------------------------------ QUESTION 2 ------------------------------
    public static Boolean question2(String password) {
        // Goal: Check if a password is valid. A valid password must:
        //   1. Contain at least one uppercase letter
        //   2. Contain at least one lowercase letter
        //   3. Contain at least one number
        //   4. Be at least 8 characters long
        //
        // Steps:
        //   1. Check each character in the password to see if ANY character is
        //      uppercase.
        //   2. Check each character in the password to see if ANY character is
        //      lowercase.
        //   3. Check each character in the password to see if ANY character is
        //      a number.
        //   4. Check if the password is at least 8 characters long

        boolean isLongEnough = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;

        // example using enhanced for loop
        for (char character : password.toCharArray()) {
            if (Character.isLowerCase(character)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(character)) {
                hasUppercase = true;
            } else if (Character.isDigit(character)) {
                hasNumber = true;
            }
        }
        isLongEnough = password.length() >= 8;

        // example using traditional for loop
        // for (int i = 0; i < password.length(); i++) {
        //     char character = password.charAt(i);
        //     if (Character.isLowerCase(character)) {
        //         hasLowercase = true;
        //     } else if (Character.isUpperCase(character)) {
        //         hasUppercase = true;
        //     } else if (Character.isDigit(character)) {
        //         hasNumber = true;
        //     }
        // }
        // isLongEnough = password.length() >= 8;

        // example not using loops (bonus points for creativity!)
        // hasLowercase = !password.equals(password.toUpperCase());
        // hasUppercase = !password.equals(password.toLowerCase());
        // hasNumber = password.chars().anyMatch(Character::isDigit);
        // isLongEnough = password.length() >= 8;

        // example using anyMatch with streams (bonus points for creativity!)
        // hasLowercase = password.chars().anyMatch(Character::isLowerCase);
        // hasUppercase = password.chars().anyMatch(Character::isUpperCase);
        // hasNumber = password.chars().anyMatch(Character::isDigit);
        // isLongEnough = password.length() >= 8;

        return isLongEnough && hasUppercase && hasLowercase && hasNumber;
    }


    // ------------------------------ QUESTION 3 ------------------------------
    public static String question3(Integer temperature) {
        // Goal: Given a temperature, determine the weather condition.
        // The conditions are:
        //   2. If the temperature is below 15, the condition is `Cold`
        //   3. If the temperature is between 16 and 25 (inclusive), the condition is `Good`
        //   4. If the temperature is above 25, the condition is `Hot`
        //
        //   Fun bonus points:
        //      5. If the temperature is above 40, the condition is `🥵`

        System.out.println("The temperature is: " + temperature);
        String condition = "Unknown";

        // example using if-else statements
        if (temperature < 15) {
            condition = "Cold";
        } else if (temperature <= 25) {
            condition = "Good";
        } else if (temperature <= 40) {
            condition = "Hot";
        } else {
            condition = "🥵";
        }

        // example using switch expression (bonus points for creativity! even if a bit messy)
        // switch (temperature) {
        //     case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14:
        //     condition = "Cold";
        //     break;
        //     case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25:
        //     condition = "Good";
        //     break;
        //     case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40:
        //     condition = "Hot";
        //     break;
        //     default:
        //     if (temperature < 0) {
        //         condition = "Cold";
        //     } else {
        //         condition = "🥵";
        //     }
        //     break;
        // }

        return condition;
    }


    // ------------------------------ QUESTION 4 ------------------------------

    public static String question4(String randomString) {
        // Goal: You are given a random string of length 10 containing ONLY the
        // letters a, b, c, d, and e. Find which letter appears the most AND
        // how many times it appears.
        // 
        // Steps:
        //   1. Loop through the string and count how many times each letter
        //      appears.
        //   2. Save the letter that appears to the variable mostFrequentChar.
        //   3. Save the number of times it appears to the variable maxFrequency.
        
        char mostFrequentChar = ' ';
        int maxFrequency = 0;

        // Step 1

        System.out.println("Random string: " + randomString);

        // Step 2, 3, & 4 - your code here
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // option 1: using getOrDefault method <- This is basically what every AI tool will suggest
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

        // option 2: using if .containsKey
        // for (char character : randomString.toCharArray()) {
        //     if (frequencyMap.containsKey(character)) {
        //         frequencyMap.put(character, frequencyMap.get(character) + 1);
        //     } else {
        //         frequencyMap.put(character, 1);
        //     }
        // }

        // for (Character key : frequencyMap.keySet()) {
        //     if (frequencyMap.get(key) > maxFrequency) {
        //         maxFrequency = frequencyMap.get(key);
        //         mostFrequentChar = key;
        //     }
        // }

        // option 3: using arrays (bonus points for creativity!)  <- Anyone who does this is an expert in Java. AI will never suggest this answer.
        // int[] counts = new int[5]; // index 0 for 'a', 1 for 'b', ..., 4 for 'e'
        // for (char character : randomString.toCharArray()) {
        //     counts[character - 'a']++;  // Increment the count for the character
        // }

        // for (int i = 0; i < counts.length; i++) {
        //     if (counts[i] > maxFrequency) {
        //         maxFrequency = counts[i];
        //         mostFrequentChar = (char) ('a' + i);
        //     }
        // }

        return mostFrequentChar + ": " + maxFrequency;
    }
    // --------------------------- End of questions ---------------------------
}


abstract class Generators {
    //  Helper classes to produce inputs for questions 1 and 4. Do not modify.
    static class RandomNumber {
        // Generates an array of random integers
        private Random random = new Random();
        
        public int[] generateRandomNumbers(int size, int min, int max) {
            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = random.nextInt(max - min + 1) + min;
            }
            return numbers;
        }
    }

    static class RandomPassword {
        // Generates a random password of specified length containing letters
        // and numbers.
        private Random random = new Random();

        public String generateRandomPassword() {
            // Generates a random 10 character password in the format: Aaaaaaaa1
            StringBuilder password = new StringBuilder();
            char randomUpperCase = (char) ('A' + random.nextInt(26));
            password.append(randomUpperCase);

            for (int i = 0; i < 8; i++) {
                char randomLowerCase = (char) ('a' + random.nextInt(26));
                password.append(randomLowerCase);
            }

            char randomNumber = (char) ('0' + random.nextInt(10));
            password.append(randomNumber);

            return password.toString();
        }
    }

    static class RandomString {
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
