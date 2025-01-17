package Basic_concepts;
import java.util.Scanner;

public class Basic_concepts
{
    //  \t 制表符
    //  \n 换行符
    //  \r 回车符
    //  \" 双引号  
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("name: \t dyl");
        System.out.printf("age: \t 22\n");
        System.out.println("gender:  male");
        int a = 10, b=1, c=1;
        a = input.nextInt();
        System.out.println(a+b+c);
        jiznhi();
    }
    public static void jiznhi()
    {
        //0b 二进制
        //0x 十六进制
        //0 八进制
        System.out.println(0b01+0b11);
    }
    public static void data_type()
    {
        // 整数类型: byte short int long
        // 浮点类型: float double
        // 字符类型: char
        // 布尔类型: boolean
        // 字符串类型: String
        // 数组类型: int[] arr = new int[10];
        // 引用类型: Object obj = new Object(); 
    }
}