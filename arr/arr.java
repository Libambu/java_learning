package arr;
public class arr 
{
    public static void main(String[] args)
    {
        init2D();
    }
    public static void init()
    {
        //静态初始化
        int arr[] = {1,2,3,4,5};
        arr[0] = 10;
        //数组遍历
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void change(int arr[])
    {
        arr[2] = 2;
    }
    //二维数组
    public static void init2D()
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = arr;
        arr2[0][0] = 10;
        System.out.println(arr[0][0]);
    }
}
