package EXERCISE;

import java.util.HashMap;
import java.util.Map;

public class qtn10 {
      public static void main(String[] args) {
        //Create a HashMap to store student names (String) and scores (Integer)
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Add some students and their scores to the HashMap
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);

        // Use a for-each loop to print each student's name and score
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
    
}
