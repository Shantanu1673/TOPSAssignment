package StringDemo;

public class PrintIntAndChar 
{
    public void print(int n, char c)
    {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    public void print(char c, int n)
    {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args)
    {
        PrintIntAndChar obj = new PrintIntAndChar();
        obj.print(100, 'A');
        obj.print('B', 200);
    }
}

