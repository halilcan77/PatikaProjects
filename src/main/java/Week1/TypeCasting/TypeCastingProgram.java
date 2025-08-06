package Week1.TypeCasting;

import java.util.Scanner;

public class TypeCastingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a decimal number
        System.out.println("Enter a decimal number: ");
        double db = input.nextDouble();

        // Ask the user for an integer number
        System.out.println("Enter an integer number: ");
        int itc = input.nextInt();

        // Explicit casting: double → int
        int doubleToInteger = (int) db;
        System.out.println("Double to Integer: " + doubleToInteger);

        // Implicit casting: int → double
        double integerToDouble = itc;
        System.out.println("Integer to Double: " + integerToDouble);
    }
}
