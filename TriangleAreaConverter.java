import java.util.Scanner;

public class TriangleAreaConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base;
        double height;

        System.out.print("Enter base of the triangle in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        height = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert cm to inches (1 inch = 2.54 cm)
        double baseInches = base / 2.54;
        double heightInches = height / 2.54;

        // Area in square inches
        double areaSqIn = 0.5 * baseInches * heightInches;

        System.out.println(
                "The Area of the triangle in sq in is " + areaSqIn +
                " and sq cm is " + areaSqCm
        );

        input.close();
    }
}