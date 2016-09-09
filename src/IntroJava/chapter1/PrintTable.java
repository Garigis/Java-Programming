package IntroJava.chapter1;

/**
 * Created by Colby on 9/8/2016.
 */
public class PrintTable {
    public static void main(String[] args) {
        System.out.println("a    a^2    a^3");
        for (int a = 1; a < 5; a++) {
            String s1 = "    ";
            String s2 = "      ";
            if (a == 4) {
                s2 = "     ";
            }
            System.out.println(a + s1 + (a * a) + s2 + (a * a * a));
        }
    }
}
