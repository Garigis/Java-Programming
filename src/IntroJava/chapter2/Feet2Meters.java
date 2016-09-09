package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class Feet2Meters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in the number of feet you want converted to meters. ");
        double feet = input.nextDouble();
        double meters = 0.305 * feet;
        System.out.println(feet + " feet is " + meters + " meters.");
    }
}
