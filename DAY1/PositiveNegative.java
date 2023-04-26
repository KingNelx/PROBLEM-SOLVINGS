import java.util.Scanner;

public class PositiveNegative {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int x = input.nextInt();

        if(x > 0){
            System.out.println(" NUMBER IS POSITIVE ");
        }
        else{
            System.out.println(" NUMBER IS NEGATIVE ");
        }
        input.close();

    }
}

// Write a Java program to get a number from the user and print whether it is positive or negative