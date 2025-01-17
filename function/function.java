package function;
public class function 
{
    public static void main(String args[])
    {
        int a = 5;
        System.out.println("The value of a is " + a);
    }
    //不带返回值，且无参数的函数
    public static void fun1()
    {
        System.out.println("This is a function without return value and without parameter.");
        return;
    }
    //不返回值，且无参数的函数
    public static void fun1(int a)
    {
        a *= 2;
        System.out.println("The value of a1 is " + a);
    }
    //带返回值，且有参数的函数
    public static int feibinaqi(int n)
    {
        if(n==1||n==2) return 1;
        else return feibinaqi(n-1)+feibinaqi(n-2);
    }
    //方法的重载，我不喜欢用
    /*
     * 同一个类中，方法名相同，参数不同，与返回值类型无关
     * 参数不同：个数不同，顺序不用，类型不同
     * 顺序不同：fn(int a,double b)和fn(double b,int a)
     */

}
