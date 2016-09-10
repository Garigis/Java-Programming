package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class Acceleration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The formula for calculating acceleration is as follows: ");
        System.out.println("     v1 - v0 ");
        System.out.println("a = ---------");
        System.out.println("        t    ");
        System.out.println("Enter the starting velocity 'v0' in meters per second, the ending" +
                " velocity 'v1' in meters per second, and the time span 't' in seconds: ");
        double v0 = input.nextInt();
        double v1 = input.nextInt();
        double time = input.nextInt();
        double accel = ((v1 - v0) / time);
        System.out.println("The average acceleration is " + accel + " meters per second.");
    }
}
