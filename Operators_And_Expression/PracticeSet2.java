package Operators_And_Expression;
import java.util.Scanner;
public class PracticeSet2 {
    public static void main(String[] args) {

    //1.
        float a = 7/4*9/2;  // ans.4.0
        System.out.println(a);


    //2. write program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

        char grade = 'A';
        grade = (char)(grade+8);

        System.out.println(grade);

        grade = (char)(grade-8);
        System.out.println(grade);


    //3.  find out whether a given no. is greater than user entered no. or not
          
         Scanner sc = new Scanner(System.in);
         int num6 = sc.nextInt();

         System.out.println(num6>8);


    }
    
}
