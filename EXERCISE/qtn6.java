package EXERCISE;

public class qtn6 {
    public static void main(String[] args) {
        // Initialize an array with five student scores
        int[] scores = {85, 92, 78, 64, 88};

        // Variables to hold the sum, highest, and lowest scores
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];  

        // Calculate the sum of all scores and find highest/lowest scores
        for (int score : scores) {
            sum += score; 
            if (score > highest) {
                highest = score; 
            }
            if (score < lowest) {
                lowest = score; 
            }
        }

        // Calculate the average score
        double average = sum / (double) scores.length;

        // Print the average, highest, and lowest scores
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
