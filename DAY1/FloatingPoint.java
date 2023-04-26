import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = 0;

        System.out.println(" Enter a floating number: ");
        x = input.nextDouble();

        if (x > 0) {
            if (x <= 1) {
                System.out.println(" POSITIVE small NUMBER");
            } else if (x > 1000000) {
                System.out.println(" POSITIVE large NUNBER");
            } else {
                System.out.println(" POSITIVE ");
            }
        } else if (x < 0) {
            if (x < 1) {
                System.out.println(" NEGATIVE small NUMBER ");
            } else if (x > 1000000) {
                System.out.println(" NEGATIVE large NUMBER");
            } else {
                System.out.println(" NEGATIVE ");
            }
        }

        else {
            System.out.println(" ZERO ");
        }

        input.close();
    }
}

/*
 * Write a Java program that reads a floating-point number and prints "zero" if
 * the number is zero. Otherwise,
 * print "positive" or "negative". Add "small" if the absolute value of the
 * number is less than 1, or
 * "large" if it exceeds 1,000,000.
 */