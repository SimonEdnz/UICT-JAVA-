package EXERCISE;

public class Car {
    String make;
    String model;
    double price;

    // Constructor with all three attributes
    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    // Overloaded constructor with only make and model, default price is $0
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.price = 0.0; // Default price
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating a car object with all attributes
        Car car1 = new Car("Toyota", "Corolla", 20000.00);
        car1.displayDetails();

        // Creating a car object with only make and model
        Car car2 = new Car("Honda", "Civic");
        car2.displayDetails();
    }
}
