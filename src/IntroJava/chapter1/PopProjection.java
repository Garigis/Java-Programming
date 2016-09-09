package IntroJava.chapter1;

/**
 * Created by Colby on 9/8/2016.
 */
public class PopProjection {

    public static void main(String[] args) {
        System.out.println("Census Projection");
        int projection = 312032486;
        int days = 365;
        // 525600 is the number of minutes in a year
        int birthPerYear = 525600 / 7;
        int deathPerYear = 525600 / 13;
        int immigrantPerYear = 525600 / 45;
        for (int i = 1; i <= 5; i++) {
            projection += birthPerYear - deathPerYear + immigrantPerYear;
            System.out.println("Population for year " + i + " is projected to be " + projection);
        }
    }
}
