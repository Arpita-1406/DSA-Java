package Method;

// In Java, a function is called a method. A method is a block of code that performs a specific task and can be reused.
// Syntax
// returnType methodName(parameters) {
//      code
//     return value;
// }

// Types of Methods

// Built-in methods:-Math.sqrt(25);

// User-defined methods:-static void display() {
//     System.out.println("Custom method");
// }

// Static vs Non-Static Methods in Java
// 1. Static Method:-A static method belongs to the class, not to an object.

// # Can be called without creating an object.
// # Accessed using class name:


// 2. Non-Static Method

// A non-static method belongs to an object of the class.

// # Object creation is required.

// # Called using object name:

public class use {
// Example of static method
    static void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        greet(); // direct call
    }

// Example of non static method
    void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Main obj = new Main(); // create object
        obj.greet();           // call method
    }
}
