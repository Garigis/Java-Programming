package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class SumDigitsInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000:");
        int number = input.nextInt();
        int sum = 0;

        while (number > 1000 || number < 0){
            System.out.print("Enter an integer between 0 and 1000:");
            number = input.nextInt();
        }

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        System.out.println("The sum of the digits is " + sum);
    }
}
