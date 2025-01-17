package gouzaohanshu;
public class GrilFriend 
{
    private String name;
    private int age;

    public GrilFriend(String name, int age)
    {
        System.out.println("Constructor called");
        this.name = name;
        this.age = age;
    }
    public void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}