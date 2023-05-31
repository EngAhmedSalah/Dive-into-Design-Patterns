package factoryMethod;

public class Triangle implements Shape
{
    public void getShapeName()
    {
        System.out.println(getClass().getName());
    }
}
