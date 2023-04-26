import java.util.Scanner;

public class NaturalNSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int sum = 0;

        System.out.print(" Enter an N number: ");
        x = input.nextInt();

        for(int i = 1; i <= x; i++){
            sum += i;
        }

        System.out.println(" Sum of N numbers is: " + sum);

        input.close();
    }
}

/*
 * Write a program in Java to display n terms of natural numbers and their sum
 */