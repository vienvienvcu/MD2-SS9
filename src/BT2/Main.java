package BT2;

public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5,6);
        shapes[2] = new Square(7);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("hinh" +(i+1));
            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
            System.out.println(shapes[i].getArea());
        }

    }
}
