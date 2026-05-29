package ConditionalStatement;
//if inside another if.
public class nested-if {
    public static void main(String[]args){
        int age = 20;
boolean idCard = true;

if(age >= 18) {

    if(idCard) {
        System.out.println("Entry Allowed");
    }
}
    }
}
