package EXERCISE;

public class qtn5 {
    public static void main(String[] args) {
        greetUser("Rebecca");
        greetUser();
    }

    // Method with parameter
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method without parameter
    public static void greetUser() {
        System.out.println("Hello, Guest!");
    }
}
