package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/10/2016.
 */
public class CompoundValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate savings with an annual interest rate of 5%.");
        System.out.println("The formula for the first $100 is as follows");
        System.out.println("100 * (1 + (0.05 / 12))\n");
        System.out.println("For following months use the following formula");
        System.out.println("(100 + previousMonthTotal) * (1 + (0.05 / 12))\n");
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();

        double nextMonths = 0;
        nextMonths = (savingAmount + nextMonths) * (1.0 + 0.00417);
        nextMonths = (savingAmount + nextMonths) * (1.0 + 0.00417);
        nextMonths = (savingAmount + nextMonths) * (1.0 + 0.00417);
        nextMonths = (savingAmount + nextMonths) * (1.0 + 0.00417);
        nextMonths = (savingAmount + nextMonths) * (1.0 + 0.00417);
        nextMonths = (savingAmount + nextMonths) * (1.0 + 0.00417);
        double output = Math.round(nextMonths * 100.0) / 100.0;

        System.out.println("after the sixth month, the account value is $" + output);
    }
}
