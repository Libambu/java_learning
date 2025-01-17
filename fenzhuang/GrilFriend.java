package fenzhuang;
public class GrilFriend 
{
    private String name;
    private int age;

    public void Setage(int a)
    {
        if(age<0)
        {
            System.out.println("Age cannot be negative");
        }
        else
        {
            age = a;
        }
    }
    public void Setname(String name)
    {
        this.name = name;
    }
    public void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}