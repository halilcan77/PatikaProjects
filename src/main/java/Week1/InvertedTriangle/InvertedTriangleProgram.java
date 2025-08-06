package Week1.InvertedTriangle;


import java.util.Scanner;

public class InvertedTriangleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user how many rows to print
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop controls number of rows
        for (int i = rows; i >= 1; i--) {

            // Inner loop prints '*' for each column
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
