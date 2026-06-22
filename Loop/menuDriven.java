package Loop;
import java.util.Scanner;

public class menuDriven{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Enter 1 to input marks");
            System.out.println("Enter 0 to exit");

            choice = sc.nextInt();

            if(choice == 1) {

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                if(marks >= 90) {
                    System.out.println("This is Good");
                }
                else if(marks >= 60) {
                    System.out.println("This is also Good");
                }
                else if(marks >= 0) {
                    System.out.println("This is Good as well");
                }
                else {
                    System.out.println("Invalid Marks");
                }
            }

        } while(choice != 0);

        System.out.println("Program Ended");
    }


 }