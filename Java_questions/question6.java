package Java_questions;

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

        // Your code here ↓↓↓↓

    


        // ↑↑↑↑ Your code goes above

        System.out.println("Question 6 - Shopping Cart Calculator");
        System.out.println("    Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("    Tax (8.5%): $" + String.format("%.2f", tax));
        System.out.println("    Total: $" + String.format("%.2f", total));
    }

    private static double randomPrice(double min, double max) {
        // Helper method that generates a random price between min and max
        return Math.round((min + Math.random() * (max - min)) * 100.0) / 100.0;
    }
}
