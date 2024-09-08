package Oops;
abstract class Parent
{
	public abstract void Message();
}
class Child1 extends Parent
{
	public void Message()
	{
		System.out.println("This is first subclass");
	}
}
class Child2 extends Parent
{
	public void Message()
	{
		System.out.println("This is Second subclass");
	}
}
public class ParentMessage
{
	public static void main(String[] args)
	{
		Child1 ch1=new Child1();
		ch1.Message();
		Child2 ch2=new Child2();
		ch2.Message();
	}
}
