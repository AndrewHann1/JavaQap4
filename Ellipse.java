class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (2 * (a * a + b * b) - Math.pow((a - b), 2)) / 2;
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }

    @Override
    public void scale(double scaleFactor) {
        a *= scaleFactor;
        b *= scaleFactor;
    }
}