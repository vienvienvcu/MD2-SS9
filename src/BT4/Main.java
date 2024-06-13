package BT4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,4);
        Circle circle = new Circle(2);
         rectangle.setColor("red");
         circle.setColor("blue");

        System.out.println("color: " + circle.getColor());
        System.out.println("area: " + circle.getArea());
        System.out.println("color: " + rectangle.getColor());
        System.out.println("area: " +rectangle.getArea());

    }
}
