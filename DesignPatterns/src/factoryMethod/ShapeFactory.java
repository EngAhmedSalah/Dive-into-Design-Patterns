package factoryMethod;

//use getShape method to get object of type shape
public class ShapeFactory
{
    public Shape getShape(String shapeName)
    {
        if (shapeName.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shapeName.equalsIgnoreCase("Triangle"))
            return new Triangle();
        else if (shapeName.equalsIgnoreCase("Circle"))
            return new Circle();
        else
            throw new RuntimeException("Not found Shape");
    }
}
