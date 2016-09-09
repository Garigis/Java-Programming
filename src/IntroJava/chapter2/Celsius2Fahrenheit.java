package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class Celsius2Fahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degrees in Celsius that you want to convert to Fahrenheit. ");
        double celsius = input.nextDouble();

        double fahrenheit = (9 / 5) * celsius + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.2");
    }
}
