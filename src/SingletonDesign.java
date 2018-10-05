// Question 1
// Implement Singleton Design Pattern on a dummy class
class Dummy
{
    static Dummy dummy;
    private int x;
    private int y;
    private Dummy() {
        this.x = 10;
        this.y = 20;
    }
    static Dummy getInstance()
    {
        if(dummy==null)
        {
            dummy=new Dummy();
        }
        return dummy;
    }
    @Override
    public String toString() {
        return "Dummy{"+ "x=" +x +" , y= "+ y + "}";
    }
}
public class SingletonDesign
{
    public static void main(String[] args)
    {
        System.out.println(Dummy.getInstance());
        System.out.println(Dummy.getInstance());
    }
}