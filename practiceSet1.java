import java.util.Scanner;

public class practiceSet1 {
 // 1.Calculate percentage of given student in CBSE board exam.
 public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your subjects marks");
    // float Science = sc.nextFloat();
    // float English = sc.nextFloat();
    // float Hindi = sc.nextFloat();
    // float Maths = sc.nextFloat();
    // float Socialscience = sc.nextFloat();

    // float percentage =(Science+English+Hindi+Maths+Socialscience)/500*100;
    // System.out.println("Percentage score in Board Exam: " + percentage);
     
// 2. Ask user to enter his/her name and greet them.

    //System.out.println("What is your name");
    //Scanner sc = new Scanner(System.in);
    //String name = sc.next();
    //System.out.println("Hello " + name + " "+ "have a nice day.");

// 3. detect whether a number enter by the user is integer or not.

    System.out.println("Enter your number");
    Scanner sc = new Scanner(System.in);
    System.out.println(sc.hasNextInt());
    sc.close();
 }   
}
