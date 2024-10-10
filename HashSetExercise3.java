import java.util.HashSet;

public class HashSetExercise3 {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> setA = new HashSet<>();

        // Adding elements
        setA.add("BMW");
        setA.add("JEEP");

        // Displaying elements
        System.out.println("HashSet Elements: " + setA);

        // Checking for duplicates
        if (!setA.add("BMW")) {
            System.out.println("Duplicate element found: BMW");
        }
    }
}
