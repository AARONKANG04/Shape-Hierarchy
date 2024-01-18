public class House extends Shape {

    private double sideLength;
    Square base;
    Triangle roof;

    public House(String color, boolean filled, double sideLength) {
        super(color, filled);
        base = new Square(color, filled, sideLength);
        roof = new Triangle(color, filled, sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return base.calculateArea() + roof.calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return 5*sideLength;
    }
}
