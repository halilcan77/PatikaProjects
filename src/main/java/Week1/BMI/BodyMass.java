package Week1.BMI;

import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 25) {
            System.out.println("You have a normal weight.");
        } else if (bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

    }
}
