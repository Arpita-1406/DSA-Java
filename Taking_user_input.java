import java.util.Scanner;

// Scanner Methods

// Method	          Used For
// nextInt()	      Integer input
// nextLong()	      Long input
// nextFloat()	      Float input
// nextDouble()	      Double input
// next()	          Single word String
// nextLine()	      Full line String
// next().charAt(0)	  Character input
// nextBoolean()	  Boolean input

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
