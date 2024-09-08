package Oops;

import java.util.Scanner;

abstract class Shape12
{
    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Areas extends Shape12
{

    @Override
    double RectangleArea(double length, double breadth)
    {
        return length * breadth;
    }

    @Override
    double SquareArea(double side)
    {
        return side * side;
    }

    @Override
    double CircleArea(double radius)
    {
        return Math.PI * radius * radius;
    }
}
public class CalculateArea 
{
	public static void main(String[] args)
	{
	        Areas area = new Areas();
	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter the Length and Breadth for RectangleArea: ");
	        double length=sc.nextDouble();
	        double breadth=sc.nextDouble();
	        double rectangleArea = area.RectangleArea(length,breadth);
	        System.out.println("Area of Rectangle: " + rectangleArea);

	        System.out.println("Enter the Length and Breadth for SquareArea: ");
	        double side=sc.nextDouble();
	        double squareArea = area.SquareArea(side);
	        System.out.println("Area of Square: " + squareArea);

	        System.out.println("Enter the Length and Breadth for CircleArea: ");
	        double radius=sc.nextDouble();    
	        double circleArea = area.CircleArea(radius);
	        System.out.println("Area of Circle: " + circleArea);
	 }
}


