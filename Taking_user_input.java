import java.util.Scanner;

public class Taking_user_input {
    public static void main(String[] args){

        System.out.println("Taking input from user");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        float c = sc.nextFloat();

        System.out.println("Enter number 2");
        int b = sc.nextInt();
        float d = sc.nextFloat();

        int sum1 = a+b;
        float sum2 = c+d;

        System.out.println("The sum of numbers is: " + sum1);
        System.out.println("The sum of number is: " + sum2);
        sc.close();


    }
    
}
