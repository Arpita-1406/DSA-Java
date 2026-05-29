package Strings;

public class string_methods {
    public static void main(String[] args) {
        
// 1. length()- return no. of characters.
        String s = "java";
        System.out.println(s.length());

//2.  toUpperCase()- Converts to uppercase
        String a = "java";
        System.out.println(a.toUpperCase());

//3.  toLowerCase()- Converts to lower case
        String b = "java";
        System.out.println(b.toLowerCase());


//4.  chaeAt()- returns character at index
        String c = "java";
        System.out.println(c.charAt(1));


//5. concat()- joins two strings
        String d = "Hello ";
        String e = "Arpita";
        System.out.println(d.concat(e));



//6. equals()- compares strings
        String f = "Java";
        String g = "Java";
        System.out.println(f.equals(g));


// Difference between == & equals()
        String h = "Java";
        String i = "Java";
        System.out.println(h.equals(i));
        System.out.println(h == i);






    }
}
