package factoryMethod;

public class Circle implements Shape {
    public void getShapeName()
    {
        System.out.println(getClass().getName());
    }
}
