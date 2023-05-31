package factoryMethod;

public class Rectangle implements Shape {
    public void getShapeName()
    {
        System.out.println(getClass().getName());
    }
}
