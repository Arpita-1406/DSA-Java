package ConditionalStatement;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int a = sc.nextInt();

        System.out.println("Enter a second number: ");
        int b = sc.nextInt();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if(b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero is not allowed");
                break;

            case 5:
                System.out.println("Result = " + (a % b));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

    
}
