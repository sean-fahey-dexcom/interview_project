package Java_questions;

public class question9 {
    public static class NotImplementedException extends RuntimeException {
        // This is a custom exception I use to indicate something hasn't been implemented yet.
        public NotImplementedException() {
            super("This functionality has not been implemented yet.");
        }
    }

    public static String coin() {
        // Simulate a coin flip (returns "H" for heads and "T" for tails)
        String result = Math.random() < 0.5 ? "H" : "T";
        System.out.printf(result + " ");
        return result;
    }

    // Counter class that keeps track of consecutive heads and tails
    static class Counter{
        // This is a counter class to keep track of the number of heads and tails we've seen recently.
        // It has methods to add heads or tails, reset the counts, and check if we've reached 10 in a row.
        // You will need to implement some of the methods in this class to make it work.

        private int totalHeads = 0;
        private int totalTails = 0;
        private int consecutiveHeads = 0;
        private int consecutiveTails = 0;

        public void add_head() {consecutiveHeads++; totalHeads++;}
        public void add_tail() {consecutiveTails++; totalTails++;}

        public void reset_heads() {
            // Your code here ↓↓↓↓
            throw new NotImplementedException();

            // ↑↑↑↑ Your code goes above
        }
        public void reset_tails() {
            // Your code here ↓↓↓↓
            throw new NotImplementedException();
            
            // ↑↑↑↑ Your code goes above
        }

        public boolean hasReachedLimit() {
            // Your code here ↓↓↓↓
            throw new NotImplementedException();

            // ↑↑↑↑ Your code goes above
        }

        public int getTotalFlips() {
            // Your code here ↓↓↓↓
            throw new NotImplementedException();

            // ↑↑↑↑ Your code goes above
        }
    }

    public static void main(String[] args) {
        // Goal: Flip a coin until you get 10 heads or 10 tails in a row. Then save the total number of flips that it took to reach that point.

        // Steps:
        //   1. Create a new instance of the Counter class. This is what we'll use to keep track of our results.
        //   2. Write a loop that calls the coin() method and updates the counter with each result.
        //   3. Exit the loop when Counter.hasReachedLimit() returns true.
        //   3. Store the result of Counter.getTotalFlips() in totalFlips.

        int totalFlips = 0;
    
        // Your code here ↓↓↓↓




        // ↑↑↑↑ Your code goes above

        System.out.println("\n");
        System.out.println("Question 9 - Coin Flip Simulation");
        System.out.println("Total flips to get 10 in a row: " + totalFlips);
    }
}
