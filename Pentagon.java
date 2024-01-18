public class Pentagon extends Shape {

    private double sideLength;

    public Pentagon(String color, boolean filled, double sideLength) {
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
        return (1.0/4)*Math.sqrt(5*(5+2*Math.sqrt(5)))*sideLength*sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 5*sideLength;
    }
}
