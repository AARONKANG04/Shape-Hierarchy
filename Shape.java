public class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("Color: " + color + " | Filled: " + filled);
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }




}
