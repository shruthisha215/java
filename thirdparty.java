public class thirdparty
{
    public static void main(String args[])
    {
        int a=10,b=20;
        int temp;
        System.out.println("before swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping:");
        System.out.println("a:"+a);
        System.out.println("b:"+temp);

    }
}