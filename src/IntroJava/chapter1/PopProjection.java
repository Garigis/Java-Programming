package IntroJava.chapter1;

/**
 * Created by Colby on 9/8/2016.
 */
public class PopProjection {

    public static void main(String[] strings) {

        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;



        double currentPopulation = 312032486;

        double secondsInYears = 60 * 60 * 24 * 365;

        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int)currentPopulation);

        }


    }
}
