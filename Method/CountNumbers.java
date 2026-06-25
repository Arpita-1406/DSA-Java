package Method;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0, zero = 0;
        int choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zero++;

            System.out.print("Press 1 to continue, 0 to stop: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zeros = " + zero);
    }
}