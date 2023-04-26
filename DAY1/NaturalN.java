import java.util.Scanner;

public class NaturalN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;

        System.out.print(" Enter a Number for N: ");
         x = input.nextInt();
        
        for(int i = 1; i <= x; i++){
            System.out.println(i);
        }
        System.out.println();

        input.close();
    }
}

/*
 * Write a program in Java to display the first 10 natural numbers.
 */
