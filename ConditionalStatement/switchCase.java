package ConditionalStatement;

// switch Statement:-Used when there are many possible values for a variable.

// Syntax
// switch(variable){
//     case value1:
         // code
//         break;
//     case value2:
        // code
//         break;
//     default:
         // code
// }

public class switchCase {
    public static void main(String[] args) {

        int day = 3;

        switch(day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
