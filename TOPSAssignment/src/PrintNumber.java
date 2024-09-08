package StringDemo;
public class PrintNumber 
{
    public void printn(int number)
    {
        System.out.println("Integer: " + number);
    }

    public void printn(double number) 
    {
        System.out.println("Double: " + number);
    }

    public void printn(float number)
    {
        System.out.println("Float: " + number);
    }

    public void printn(long number) 
    {
        System.out.println("Long: " + number);
    }

    public void printn(String text)
    {
        System.out.println("String: " + text);
    }

    public static void main(String[] args)
    {
        PrintNumber pn = new PrintNumber();
        pn.printn(5);
        pn.printn(5.5);
        pn.printn(5.5f);
        pn.printn(123456789L);
        pn.printn("Hello");
    }
}
