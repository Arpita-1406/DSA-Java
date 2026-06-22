package ConditionalStatement;

// if-else Statement:-Executes one block if the condition is true and another if it is false.

// Syntax:-if(condition){
     // code if true
// }else{
    // code if false
// }


public class if-else {
     public static void main(String[] args) {

        int num = 5;

        if(num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
