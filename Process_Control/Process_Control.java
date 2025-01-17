package Process_Control;
import java.util.Scanner;
public class Process_Control 
{
    public static void main(String[] args) 
    {
        fenzhi();
    }
    public static void fenzhi()
    {
        // if语句，和C++一模一样
        Scanner sc = new Scanner(System.in);
        // switch语句，和C++一样
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("你选择了1");
                break;//break省略导致case穿透
            case 2:
                System.out.println("你选择了2");
                break;
            case 3:
                System.out.println("你选择了3");
                break;
            default:
                System.out.println("你没有选择任何选项");
                break;
        }
        sc.close();
    }
    public static void xunhuan()
    {
        // for语句，和C++一样
        // while语句，和C++一样
    }
}
