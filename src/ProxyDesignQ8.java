// Question 8
//Implement proxy design for accessing Record of a student and allow the access only to Admin.

interface Accessable
{
    void access();
}
class Admin
{
    private String name="Admin";
    public Admin(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
}
class Record implements Accessable
{
    Admin admin;
    public Record(Admin admin) {
        this.admin = admin;
    }
    @Override
    public void access()
    {
        System.out.println("You are Admin, you can access the record.");
    }
}
class Proxy extends Record
{
    public Proxy(Admin admin) {
        super(admin);
    }
    @Override
    public void access() {
        if(admin.getName().equals("Admin"))
        {
            System.out.println("Allowed");
            super.access();
        }
        else
        {
            System.out.println("Not allowed to access");
        }
    }
}
public class ProxyDesignQ8
{
    public static void main(String[] args)
    {
        System.out.print("When we enter as Admin : ");
        Admin abc=new Admin("Admin");
        Record record=new Proxy(abc);
        record.access();
        System.out.println();
        System.out.print("When we enter as others : ");
        Admin abc1=new Admin("others");
        Record record1=new Proxy(abc1);
        record1.access();
    }
}