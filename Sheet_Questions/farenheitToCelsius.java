package Sheet_Questions;

import java.util.Scanner;

public class farenheitToCelsius {
    public static void main(String[] args) {
        
    

    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double inputTemp = scanner.nextDouble();

      
        double celsius = (inputTemp - 32) * 5 / 9;
        double fahrenheit = (inputTemp * 9 / 5) + 32;

       
        System.out.printf("Celsius: %.2f\n", celsius);
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
    }
}