import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = 0;
        int x2 = 0;
        int x3 = 0;

        System.out.println(" Enter 1st Number: ");
        x1 = input.nextInt();
        System.out.println(" Enter 2nd Number: ");
        x2 = input.nextInt();
        System.out.println(" Enter 3rd Number: ");
        x3 = input.nextInt();

        if (x1 > x2 && x1 > x3) {
            System.out.println(" Greatest number is: " + x1);
        } else if (x2 > x1 && x2 > x3) {
            System.out.println(" Greatest Number is: " + x2);
        }else{
            System.out.println(" Greatest number is: " + x3);
        }

        input.close();
    }
}

// Take three numbers from the user and print the greatest number.