package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class VolumeCylinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of your cylinder. ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
