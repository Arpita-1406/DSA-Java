package Operators_And_Expression;

public class Associativity_and_Precedence {
    public static void main(String[] args) {

// Parentheses Precedence
        int num1 = (10 + 5) * 2;
        System.out.println(num1);

    // Left to right Associativity     
        int num2 = 20 / 5 * 2;
         System.out.println(num2);

          
         int num3 = 10 + 8 % 3 * 2;
          System.out.println(num3);

// Unary Operator
           int num = 5;
           int num4 = ++num * 2;
           System.out.println(num);
           System.out.println(num4);


        int num5 = 5 + 2 * 3 - 4 / 2;
        System.out.println(num5);  
        


        int a = 10;
        int b = 5;
        int c = 2;
        int result = a - b + c * 4 / 2;

        System.out.println(result);
    }
}
