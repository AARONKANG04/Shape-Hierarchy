public class Square extends Shape {

    private double sideLength;

    public Square(String color, boolean filled, double sideLength) {
        super(color, filled);
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
        return sideLength*sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 4*sideLength;
    }
}
