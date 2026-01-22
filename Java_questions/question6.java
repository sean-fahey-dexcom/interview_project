package Java_questions;
import java.util.Arrays;


public class question6 {
    public static void main(String[] args) {
        // Goal: Calculate the total cost of items in a shopping cart with tax.
        //
        // Steps:
        //   1. Add the items to determine the subtotal (USE THE `subtotal` VARIABLE).
        //   2. Calculate the tax based on the subtotal (USE THE `tax` VARIABLE).
        //   3. Calculate the total cost (subtotal + tax) (USE THE `total` VARIABLE).

        // Item prices
        double[] items = {
            randomPrice(5.00, 50.00), 
            randomPrice(5.00, 50.00), 
            randomPrice(5.00, 50.00), 
            randomPrice(5.00, 50.00)
        };

        // Tax rate (8.5%)
        float taxRate = 0.085f;

        // Variables to calculate (initialize these)
        double subtotal = 0.0;
        double tax = 0.0;
        double total = 0.0;

        // Option 1: Calculate subtotal using a loop
        for (double price : items) {
            subtotal += price;
        }
        tax = subtotal * taxRate;
        total = subtotal + tax;

        // Option 2: Use index positions
        subtotal = items[0] + items[1] + items[2] + items[3];
        tax = subtotal * taxRate;
        total = subtotal + tax;

        // Option 3: Streams
        subtotal = Arrays.stream(items).sum();
        tax = subtotal * taxRate;
        total = subtotal + tax;

        // Option 3b: Using Collections and streams
        subtotal = Arrays.stream(items).reduce(0.0, Double::sum);
        tax = subtotal * taxRate;
        total = subtotal + tax;

        System.out.println("Question 6 - Shopping Cart Calculator");
        System.out.println("    Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("    Tax:      $" + String.format("%.2f", tax));
        System.out.println("    Total:    $" + String.format("%.2f", total));
    }

    private static double randomPrice(double min, double max) {
        // Helper method that generates a random price between min and max
        return Math.round((min + Math.random() * (max - min)) * 100.0) / 100.0;
    }
}
