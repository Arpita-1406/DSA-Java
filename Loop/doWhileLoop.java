package Loop;

// do-while Loop:-Executes the code at least once.

// Syntax:-do{
//            code
//         }while(condition);

public class doWhileLoop {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while(i <= 5);
    }
}
