import java.util.ArrayList;

public class ArrayListExercise1 {
     public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<>();

        // Adding elements
        cars.add("VOLVO");
        cars.add("JEEP");
        cars.add("BMW");
        cars.add("BENZ");
        System.out.println("cars list after adding elements: " + cars);

        System.out.println("Second car: " + cars.get(1));

        // Removing an element
        cars.remove("BMW");
        System.out.println("Cars list after removing BMW: " + cars);
    }
}
