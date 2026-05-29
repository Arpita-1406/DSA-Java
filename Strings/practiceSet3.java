package Strings;

public class practiceSet3 {
    public static void main(String[] args) {
      
  // 1. Convert a string to Lower case      
        String name = "Arpita Pandey";
        name = name.toLowerCase();
        System.out.println(name);

//2. replace space with underscore
        String text = "Arpita learns Java programming language.";
        text = text.replace(" ","_" );
        System.out.println(text);
        
// 3. letter = "Dear <name> , Thanks a lot"
//    replace <name> with a string(some name)        
        String letter = "Dear <name> , Thanks a lot";
        letter = letter.replace("<name>", "Arpita");
        System.out.println(letter);

// 4. sequence caracter
        String sent = "Java,\n\tAn Object Oriented Programming Language.\n\tThank\tYou";
        System.out.println(sent); 
    }
    
}
