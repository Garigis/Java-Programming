package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/10/2016.
 */
public class ComputeBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your body weight in pounds to compute your BMI: ");
        double weight = input.nextDouble();
        System.out.print("your height to compute your BMI: ");
        double height = input.nextDouble();
        double kilograms = weight * 0.45359237;
        double meters = height * 0.0254;
        meters = meters * meters;

        double compute = kilograms / meters;
        compute = Math.round(compute * 10000.0) / 10000.0;
        System.out.println("Your BMI is " + compute);
    }
}
