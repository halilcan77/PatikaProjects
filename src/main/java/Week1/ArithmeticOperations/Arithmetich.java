package Week1.ArithmeticOperations;

import java.util.Scanner;

public class Arithmetich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = scan.nextInt();

        System.out.println("Enter the second number: ");
        double b = scan.nextInt();

        System.out.println("Enter third number: ");
        double c = scan.nextInt();

        double sonuc = a+b*c-b;


        System.out.println("calculation result : " + sonuc);


    }
}
