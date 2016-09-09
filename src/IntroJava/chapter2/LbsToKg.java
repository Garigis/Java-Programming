package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class LbsToKg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of pounds to convert to kilograms: ");
        double pounds = input.nextDouble();
        double kilograms = 0.454 * pounds;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
    }
}
