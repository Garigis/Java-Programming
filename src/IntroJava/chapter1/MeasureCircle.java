package IntroJava.chapter1;

/**
 * Created by Colby on 9/8/2016.
 */
public class MeasureCircle {
    public static void main(String[] args) {
        System.out.println("Find the area and perimeter of a circle with a radius of 5.5");
        double radius = 5.5;
        double pi = Math.PI;
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;
        System.out.println("The area of this circle is " + area);
        System.out.println("The perimeter of this circle is " + perimeter);
    }
}
