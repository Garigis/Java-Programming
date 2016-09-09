package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class TipCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotalEntry = input.nextDouble();
        double gratuityEntry = input.nextDouble();
        double gratuity = subtotalEntry * (gratuityEntry / 100);
        double total = gratuity + subtotalEntry;
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}
