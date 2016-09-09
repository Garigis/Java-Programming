package IntroJava.chapter1;

/**
 * Created by Colby on 9/8/2016.
 */
public class SpeedKM {

    public static void main(String[] args) {
        System.out.println("A runner runs 24 miles in 1 hour 40 minutes and 35 seconds. ");
        System.out.print("Find the average speed in kilometers per hour.");
        double hours = (1 + (((40.0 * 60.0) + 35.0) / 3600));
        double kilometers = 24.0 * 1.6;
        double kph = kilometers / hours;
        System.out.println("\nThe runner ran " + kph + " kilometers per hour.");
    }
}
