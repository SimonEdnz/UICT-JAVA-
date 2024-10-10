import java.util.HashMap;

public class HashMapExercise4 {
     public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> Cars = new HashMap<>();

        // Adding key-value pairs
       Cars.put("BMW", 5);
        Cars.put("JEEP", 10);
       

        // Accessing elements
        System.out.println("JEEP quantity: " + Cars.get("JEEP"));

        // Displaying all key-value pairs
        System.out.println("HashMap Elements: " + Cars);
    }
    
}
