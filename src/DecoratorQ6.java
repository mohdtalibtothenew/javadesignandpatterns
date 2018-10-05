// Question 6
// Implement Decorator pattern to decorate the Pizza with topings
interface Topings
{
    String addTopings();
}
enum PizzaSize{Small,Large}
class Pizza implements Topings
{
    private String Size;
    public Pizza(String size) {
        Size = size;
    }
    public String getSize() {
        return Size;
    }
    public void setSize(String size) {
        Size = size;
    }
    @Override
    public String addTopings() {
        return "A Pizza with Size : " + Size;
    }
}
class DecoratePizza implements Topings
{
    private Topings topings;
    private String TopingType;
    private String AddNewFeature;
    public DecoratePizza(Topings topings,String addNewFeature,String topingType) {
        this.topings = topings;
        AddNewFeature = addNewFeature;
        TopingType = topingType;
    }
    public String getTopingType() {
        return TopingType;
    }
    public void setTopingType(String topingType) {
        TopingType = topingType;
    }
    public Topings getTopings() {
        return topings;
    }
    public void setTopings(Topings topings) {
        this.topings = topings;
    }
    public String getAddNewFeature() {
        return AddNewFeature;
    }
    public void setAddNewFeature(String addNewFeature) {
        AddNewFeature = addNewFeature;
    }
    @Override
    public String addTopings()
    {
        return topings.addTopings() + " Pizza with " + TopingType +" and including "+ AddNewFeature;
    }
}
class DecoratorQ6
{
    public static void main(String[] args) {
        Pizza pizza=new Pizza("Small");
        pizza.addTopings();
        DecoratePizza decoratePizza=new DecoratePizza(new Pizza("Small"),"Coke","Tomato");
        System.out.println(decoratePizza.addTopings());
        Pizza pizza1=new Pizza("Small");
        pizza1.addTopings();
        DecoratePizza decoratePizza1=new DecoratePizza(new Pizza("Large"),"Pepsi","Capsicum");
        System.out.println(decoratePizza1.addTopings());
    }
}