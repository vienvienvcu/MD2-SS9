package TH2;

import TH1.ComparableCircle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"indigo",false);
        System.out.println("Pre-sorted:");
        for (Circle c : circles) {
            System.out.println(c);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("Post-sorted:");

        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
