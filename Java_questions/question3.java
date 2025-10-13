package Java_questions;

import java.util.Random;


public class question3 {
    public static void main(String[] args) {
        // Goal: Given a temperature, determine the weather condition.
        // The conditions are:
        //   2. If the temperature is below 15, the condition is `Cold`
        //   3. If the temperature is between 16 and 25 (inclusive), the condition is `Good`
        //   4. If the temperature is above 25, the condition is `Hot`
        
        //   Fun bonus points:
        //      5. If the temperature is above 40, the condition is `🥵`

        Integer temperature = randomTemperature(-10, 50);
        String condition = "Unknown";

        // Your code here ↓↓↓↓




        // ↑↑↑↑ Your code goes above

        System.out.println("Question 3 - Weather Condition");
        System.out.println("    The temperature is: " + temperature);
        System.out.println("    The condition is: " + condition);
    }

    private static Integer randomTemperature (int min, int max) {
        // Generates a random temperature between min and max (inclusive)
        Random random = new Random();
        int range = (max - min) + 1;
        return random.nextInt(range) + min;
    }
}
