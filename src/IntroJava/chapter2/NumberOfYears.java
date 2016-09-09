package IntroJava.chapter2;

import java.util.Scanner;

/**
 * Created by Colby on 9/9/2016.
 */
public class NumberOfYears {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double minutes = input.nextDouble();
        int remainingMinutes = (int)minutes;

        int years = remainingMinutes / (1440 * 365);
        remainingMinutes = remainingMinutes % (1440 * 365);

        int days = remainingMinutes / 1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
