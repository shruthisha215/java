public class logical
{
    public static void main(String args[])
    {
        int mark1=85;
        int mark2=98;
        if(mark1==mark2 && mark1>mark2)
        {
            System.out.println("Grade:A");
        }
        if(mark2==mark1 || mark2>mark1)
        {
            System.out.println("Grade:O");
        }
        else{
            System.out.println("invalid");
        }

    }
}