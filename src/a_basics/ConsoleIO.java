package a_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("You entered " + n);

        System.out.println("Enter a name: ");
        String name = scanner.next();
        System.out.println("You entered " + name);
    }
}

/* TODO run in cmd:
open cmd in the classes' folder
javac ConsoleIO.java
java ConsoleIO.java
 */