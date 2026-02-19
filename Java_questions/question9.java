package Java_questions;

public class question9 {
    public static class NotImplementedException extends RuntimeException {
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
        private int totalHeads = 0;
        private int totalTails = 0;
        private int consecutiveHeads = 0;
        private int consecutiveTails = 0;

        public void add_head() {consecutiveHeads++; totalHeads++;}
        public void add_tail() {consecutiveTails++; totalTails++;}

        public void reset_heads() {consecutiveHeads = 0;}
        public void reset_tails() {consecutiveTails = 0;}

        public boolean hasReachedLimit() {
            return consecutiveHeads >= 10 || consecutiveTails >= 10;

        }

        public int getTotalFlips() {
            return totalHeads + totalTails;
        }
    }

    public static void main(String[] args) {
        // Goal: Flip a coin until you get 10 heads or 10 tails in a row. Then save the total number of flips that it took to reach that point.
        // Steps:
        //   1. Write a loop that calls the coin() method and keeps track of consecutive heads or tails.
        //   2. Stop the loop when you reach 10 consecutive heads or tails.
        //   3. Print the total number of flips it took to reach that point.

        Counter counter = new Counter();

        while (!counter.hasReachedLimit()) {
            String result = coin();
            if (result.equals("H")) {
                counter.add_head();
                counter.reset_tails();
            } else {
                counter.add_tail();
                counter.reset_heads();
            }

        }
    
        System.out.println("\n");
        System.out.println("Question 9 - Coin Flip Simulation");
        System.out.println("Total flips to get 10 in a row: " + counter.getTotalFlips());
    }
}
