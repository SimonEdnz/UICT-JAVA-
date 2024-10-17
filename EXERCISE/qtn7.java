package EXERCISE;

import java.util.Scanner;

public class qtn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the input string to uppercase
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        //Find the length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);

        // Extract substring from the 3rd to 5th character (indices 2 to 4)
        if (length >= 5) {
            String substring = input.substring(2, 5);
            System.out.println("Substring (3rd to 5th character): " + substring);
        } else {
            System.out.println("String is too short to extract the substring.");
        }
    }
}
