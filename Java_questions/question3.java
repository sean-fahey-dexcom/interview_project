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

        // Option 1: Use if-else statements to determine the condition
        if (temperature < 15) {
            condition = "Cold";
        } else if (temperature <= 25) {
            condition = "Good";
        } else if (temperature <= 40) {
            condition = "Hot";
        } else {
            condition = "🥵";
        }


        // Option 2: Use a switch statement to determine the condition. A bit
        //           ugly, but technically works.
        switch (temperature) {
            case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25:
                condition = "Good";
                break;
            case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39:
                condition = "Hot";
                break;
            case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50:
                condition = "🥵";
                break;
            default:
                condition = "Cold";
                break;
        }



        System.out.println("Question 3 - Weather Condition");
        System.out.println("    The temperature is: " + temperature);
        System.out.println("    The condition is:   " + condition);
    }

    private static Integer randomTemperature (int min, int max) {
        // Generates a random temperature between min and max (inclusive)
        Random random = new Random();
        int range = (max - min) + 1;
        return random.nextInt(range) + min;
    }
}
