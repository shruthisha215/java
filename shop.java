public class shop
{
    public static void main(String args[])
    {
        String[] products={"cake","puffs","coffee","coke","roll"};
        int[] price={50,40,20,45,35};
        for(int i=0;i<=5;i++)
        {
            System.out.println("the price of " + products[i] +":" + price[i]);
        }
    }
}