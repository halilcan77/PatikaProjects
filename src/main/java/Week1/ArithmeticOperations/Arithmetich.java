package Week1.ArithmeticOperations;

import java.util.Scanner;

public class Arithmetich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("Enter third number: ");
        int c = scan.nextInt();

        int result = a+b*c-b;


        System.out.println("calculation result : " + result );


    }
}
