import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int add = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;

        System.out.print(" Enter 1st number: ");
        x = input.nextInt();

        System.out.print(" Enter 2nd number: ");
        y = input.nextInt();

        add = x + y;
        sub = x - y;
        mul = x * y;
        div = x / y;

        System.out.println(" Result for adding: " + add);
        System.out.println(" Result for subtracting: " + sub);
        System.out.println(" Result for multiplying: " + mul);
        System.out.println(" Result for dividing: " + div);

    }
}

//Write a Java program to add two numbers and print them on the screen
//Write a Java program to sub two numbers and print them on the screen
//Write a Java program to multiply two numbers and print them on the screen
//Write a Java program to divide two numbers and print them on the screen
