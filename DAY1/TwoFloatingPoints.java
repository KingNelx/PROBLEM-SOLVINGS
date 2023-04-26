import java.util.Scanner;

public class TwoFloatingPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter 1st number: ");
        double x1 = input.nextDouble();

        System.out.println(" Enter 2nd number: ");
        double x2 = input.nextDouble();

        x1 = Math.round(x1 * 1000);
        x1 = x1 / 1000;

        x2 = Math.round(x2 * 1000);
        x2 = x2 / 1000;

        if(x1 == x2){
            System.out.println(" BOTH DECIMAL ARE THE SAME ");
        }else{
            System.out.println(" THEY ARE NOT THE SAME ");
        }

        input.close();

    }
}

/*
 * Write a Java program that reads in
 * two floating-point numbers and tests whether they are the same up to three
 * decimal places.
 */