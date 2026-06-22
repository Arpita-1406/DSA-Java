package ConditionalStatement;

// else-if Ladder:-Used when multiple conditions need to be checked.

public class else_if {
    public static void main(String[] args) {

        int marks = 75;

        if(marks >= 90) {
            System.out.println("Grade A");
        }
        else if(marks >= 70) {
            System.out.println("Grade B");
        }
        else {
            System.out.println("Grade C");
        }
    } 
}
