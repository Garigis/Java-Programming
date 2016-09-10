package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/10/2016.
 */
public class RunwayLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Find the minimum runway length using the following formula: ");
        System.out.println("          v^2 ");
        System.out.println("length = -----");
        System.out.println("          2a  ");

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double length = (Math.pow(speed, 2.0)) / (2.0 * acceleration);
        double output = Math.round(length * 1000.0) / 1000.0;
        System.out.println("The minimum runway length for this airplane is " + output + " meters long.");
    }
}
