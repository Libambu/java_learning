import java.util.Scanner;

public class operator 
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("算数运算符的计算结果");
        Suanshu_operator();
        System.err.println("字符字符串");
        string_add();
        System.err.println("自增自减运算符");
        selfadd();
    }
    public static void Suanshu_operator()
    {
        //  +-*/%
        int a = -11;
        int b = 3;
        System.out.println(a%b);
        System.out.println(a/b);
        System.out.println(1.1+1.01);
    }
    public static void transform()
    {
        // 隐式转换,将小类型转换为大类型
        // byte,short,char先转换为int,然后再计算
        // float,double先转换为double,然后再计算
        int a = 10; // int
        double b = 2.5; // double
        double c = a + b; // int + double = double

        // 强制类型转换,可能会丢失精度
        int d = (int) (a + b); // double + int = double,强制类型转换为int
    }
    public static void string_add()
    {
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2; // 字符串拼接
        char ch = 'a';
        char ch2 = (char) (ch + 1); // 字符加1
        System.out.println(ch2);
    }
    public static void selfadd()
    {
        int a = 10;
        int b = a++;
        int c = ++a;
        System.out.println(b);
        System.out.println(c);
    }
}
