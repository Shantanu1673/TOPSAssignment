package Oops;
class parent12
{
	public void Display()
	{
		System.out.println("This is a parent class");
	}
}
class child extends parent12
{
	public void Display()
	{
		System.out.println("This is a child class");

	}
}
public class parent789
{
	public static void main(String[] args) 
	{
		parent12 p1=new parent12();
		child c1=new child();
		p1.Display();
		c1.Display();
		
		
		p1=new child();
		p1.Display();
	}
}
