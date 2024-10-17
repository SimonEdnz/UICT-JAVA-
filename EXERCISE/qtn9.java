package EXERCISE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class qtn9 {
    public static void main(String[] args) {
        try {
            //Create a File object for "data.txt"
            File file = new File("data.txt");
            Scanner reader = new Scanner(file);

            // Read and print the file contents line by line
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException and display an error message
            System.out.println("Error: The file 'data.txt' was not found.");
        }
    }
}
