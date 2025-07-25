package Week1.flightticket;

import java.util.Scanner;

public class flight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the distance in kilometers");
        double distance = input.nextDouble();

        System.out.println("please enter your age ");
        int age = input.nextInt();

        System.out.println("please select the type 1--> one way , 2-->round-trip");
        int type = input.nextInt();

        if (distance <= 0 || age <= 0 || (type != 1 && type != 2)) {
            System.out.println("You have entered invalid data!");
            return; }

        double price = distance * 0.10;
        double dcrate = 0.0;

        if (age < 12) {
            dcrate = 0.50;}

        else if (age >=12  && age <= 24) {
            dcrate = 0.10;
        }
        else if (age > 65) {
            dcrate = 0.30;
        }


        double totalprice = price - dcrate*price;


        if (type  == 2){
            totalprice -= totalprice * 0.20;
            totalprice *= 2;
        }


        System.out.println("Your total price is " + totalprice + "TL");

    }


}

