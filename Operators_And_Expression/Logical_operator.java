package Operators_And_Expression;

public class Logical_operator {

    public static void main(String[] args) {
    int x = 5;
    System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10

    
    System.out.println(x > 5 || x < 10); // returns true because 5 is not greater than 3 but (OR) 5 is less than 10


    System.out.println(!(x > 3 && x < 10)); // returns false because 5 is greater than 3 AND 5 is less than 10 it gives true but its complement gives false.
  
  
  }
    
}
