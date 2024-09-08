package Oops;
class Area
{
	
	public void setData(int length, int breadth)
	{
		int areaR= length* breadth;
		System.out.println("Area of a Rectangle is: "+areaR);
	}
	public void setData(int length)
	{
		int areaS= length*length;
		System.out.println("Area of a Square is: "+areaS);
	}
}
public class AreaOfRecAndSqu
{
	public static void main(String[] args) 
	{
		Area a1= new Area();
		a1.setData(5, 4);
		a1.setData(5);
	}
}
