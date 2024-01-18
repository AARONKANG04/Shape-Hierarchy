public class ShapeDriver {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Square("blue", true, 5);
        array[1] = new Pentagon("red", true, 12);
        array[2] = new House("yellow", true, 2);
        for (Shape shape : array) {
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }
    }
}
