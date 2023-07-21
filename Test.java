public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Ellipse("Ellipse", 4, 6);
        shapes[1] = new Circle("Circle", 5);
        shapes[2] = new Triangle("Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        for (Shape shape : shapes) {
            System.out.println("Before scaling: " + shape);
            scaleAll(shapes, 1.5); // Scale all shapes by a factor of 1.5
            System.out.println("After scaling: " + shape);
            System.out.println();
        }
    }

    public static void scaleAll(Scalable[] scalables, double scaleFactor) {
        for (Scalable scalable : scalables) {
            scalable.scale(scaleFactor);
        }
    }
}