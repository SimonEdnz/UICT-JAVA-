package EXERCISE;

public class qtn2 {
    public static void main(String[] args) {
        double radius = 10.5; 
        double area = Math.PI * radius * radius;
        System.out.println("Area as double: " + area);

        // Type casting to integer
        int area1 = (int) area;
        System.out.println("Area as integer: " + area1);
    }
}
