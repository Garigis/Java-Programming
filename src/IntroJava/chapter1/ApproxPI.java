package IntroJava.chapter1;

/**
 * Created by Colby on 9/8/2016.
 */
public class ApproxPI {

    public static void main(String[] args) {
        System.out.println("Use this formula to approximate pi");
        System.out.println("4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))");
        double answer1 = 4.0 * (1.0 - (1.0/3.0) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println("pi is approximately " + answer1);
        System.out.println("\nUse this formula to approximate pi");
        System.out.println("4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13))");
        double answer2 = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
        System.out.println("pi is approximately " + answer2);
    }
}
