package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class CalcEnergy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the energy needed to heat water from an initial temperature to a final "
                + "temperature using the following formula: ");
        System.out.println("Q = M * (finalTemperature - initialTemperature) * 4184");
        System.out.print("Enter the amount of water in kilograms: ");
        double amount = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initTemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double endTemp = input.nextDouble();
        double energy = amount * (endTemp - initTemp) * 4184;
        System.out.print("The energy needed is " + energy);
    }
}
