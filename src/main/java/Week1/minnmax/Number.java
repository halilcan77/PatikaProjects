package Week1.minnmax;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they will enter
        System.out.print("How many numbers will you enter: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Invalid number.");
            return;
        }

        // Take the first number as initial largest and smallest
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int largest = number;
        int smallest = number;

        // Check the rest of the numbers
        for (int i = 1; i < n; i++) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number > largest) largest = number;
            if (number < smallest) smallest = number;
        }

        // Print results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
