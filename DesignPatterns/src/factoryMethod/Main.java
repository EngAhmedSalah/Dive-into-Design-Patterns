package factoryMethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        Shape triangle = shapeFactory.getShape("Triangle");
        Shape rectangle = shapeFactory.getShape("Rectangle");

        circle.getShapeName();
        triangle.getShapeName();
        rectangle.getShapeName();
    }
}