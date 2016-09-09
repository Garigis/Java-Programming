package IntroJava.chapter1;

/**
 * Created by Colby on 9/8/2016.
 */
public class MeasureRectangle {

    public static void main(String[] args) {
        System.out.println("Find the area and perimeter of a rectangle with a width of 4.5 and height of 7.9");
        double width = 4.5;
        double height = 7.9;
        double area = width * height;
        double perimeter = (width * 2) + (height * 2);
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}
