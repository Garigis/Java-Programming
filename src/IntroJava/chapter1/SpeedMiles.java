package IntroJava.chapter1;

/**
 * Created by Colby on 9/8/2016.
 */
public class SpeedMiles {

    public static void main(String[] args) {
        System.out.println("A runner runs 14 kilometers in 45 minutes and 30 seconds. ");
        System.out.print("Find the average speed in miles per hour.");
        double hours = (((45.0 * 60.0) + 30.0) / 3600.0);
        double miles = 14.0 / 1.6;
        double mph = miles / hours;
        System.out.println("\nThe runner ran " + mph + " miles per hour.");
    }
}
