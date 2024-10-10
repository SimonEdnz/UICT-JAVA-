public class GenereicMethodExercise5 {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        System.out.println("Integer Array:");
        printArray(intArray);

        String[] strArray = {"Benz", "BMW", "Jeep"};
        System.out.println("String Array:");
        printArray(strArray);
    }
    
}
