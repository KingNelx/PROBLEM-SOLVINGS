import java.util.Scanner;

public class GenerateDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;

        System.out.println(" Enter a NUMBER: ");
        x = input.nextInt();

        switch (x) {
            case 1:
                System.out.println(" MONDAY ");
                break;
            case 2:
                System.out.println(" TUESDAY ");
                break;
            case 3:
                System.out.println(" WEDNESDAY");
                break;
            case 4:
                System.out.println(" THURSDAY ");
                break;
            case 5:
                System.out.println(" FRIDAY ");
                break;
            case 6:
                System.out.println(" SUNDAY ");
                break;
            case 7:
                System.out.println(" SATURDAY ");
                break;
            default:
                System.out.println(" NOT FOUND");
                break;
        }

        input.close();
    }
}

/*
 * Write a Java program that keeps a
 * number from the user and generates an integer between 1 and 7 and displays
 * the name of the weekday
 */