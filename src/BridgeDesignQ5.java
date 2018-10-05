// Question 5
//Implement Bridge Design Pattern for Color and Shape such that Shape and Color can be combined together.
// e.g BlueSquare, RedSquare, PinkTriangle etc.
interface Color
{
    String color();
}
class RedColor implements Color
{
    @Override
    public String color()
    {
        return "red";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
class BlueColor implements Color
{
    @Override
    public String color() {
        return "blue";
    }
}
abstract class Shape
{
    String Type;
    Color color;
    public Shape(String type, Color color) {
        Type = type;
        this.color = color;
    }
}
class Sqaure extends Shape
{
    public Sqaure(String type, Color color) {
        super("hollow", color);
    }
    @Override
    public String toString() {
        return " Square {Type= " + Type + " Color = " + color.color() + "}";
    }
}
class Triangle extends Shape
{
    public Triangle(String type, Color color) {
        super("Solid", color);
    }
    @Override
    public String toString() {
        return " Triangle {Type= " + Type + " Color = " + color.color() + "}";
    }
}
public class BridgeDesignQ5
{
    public static void main(String[] args)
    {
        Sqaure sqaure=new Sqaure("hollow",new RedColor());
        System.out.println(sqaure);
        Sqaure sqaure1=new Sqaure("solid",new BlueColor());
        System.out.println(sqaure1);
        Triangle triangle=new Triangle("hollow",new BlueColor());
        System.out.println(triangle);
    }
}