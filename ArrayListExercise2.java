import java.util.ArrayList;

public class ArrayListExercise2 {
     public static void main(String[] args) {
        // Creating an ArrayList to store integers
        ArrayList<Integer> myNumbers = new ArrayList<>();

        // Adding elements to ArrayList
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);

        // Displaying the elements
        System.out.println("ArrayList Elements: ");
        for (Integer number : myNumbers) {
            System.out.println(number);
        }
    }
}
