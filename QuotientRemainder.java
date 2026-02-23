import java.util.Scanner;

public class QuotientRemainder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        double quotient = number1 / number2;
        double remainder = number1 % number2;

        System.out.println(
                "The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 +
                " and " + number2
        );

        input.close();
    }
}