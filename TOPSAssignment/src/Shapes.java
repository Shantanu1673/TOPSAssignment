package Oops;
class Shape
{
	public void setData() 
	{
		System.out.println("This is this is shape");
	}
}
class Rectangle extends Shape
{
	@Override
	public void setData()
	{
		super.setData();
		System.out.println("This is rectanguler Shape");
	}
}

class Circle extends Shape
{

public void setData() 
	{
		System.out.println("This is circular shape");
	}
}
class Square extends Rectangle
{
	@Override
	public void setData() 
	{
		super.setData();
		System.out.println("Square is a rectangle");
		
	}
}

public class Shapes 
{
	public static void main(String[] args) 
	{
		Square s1=new Square();
		s1.setData();	
	}
}
