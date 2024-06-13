package org.com;

import welcome.Hello;
import java.util.Scanner;

public class Main {
   // private static java.lang.String String;

    public static void main(String[] args) {
        Hello HelloObject = new Hello();
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String your_name = scan.nextLine();
        HelloObject.setupName(your_name);
        HelloObject.welcome();
        System.out.println("Hello, world!");
        HelloObject.byeBay();
    }
}

// Primitive types
// Create Main class with a main(String[] args) method that,
// when run, outputs "Hello, world!" to the console.
// Create a separate package 'com.welcome'.
// Create a Hello class in it and add methods to it:
// setupName(String name) - assigns the person's name to an internal private variable,
// welcome() - forms and outputs the greeting "Hello, %name%" (the name must be substituted),
// byeBay() - says goodbye and outputs the phrase "Bye, %name%" to the console
// In Main class connect this package,
// and at the beginning of the program ask for the person's name,
// assign it to the Hello class variable, then greet them,
// and at the end say goodbye before closing the program.
// Between 'hello' and 'bye' will be your "Hello, world!".
