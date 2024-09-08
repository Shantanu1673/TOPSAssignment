package Oops;
class Member1
{
	int Age,Salary,PhoneNumber;
	String Name, Address, DataMember;
	public void setData()
	{
		Age=21;
		Salary=25000;
		PhoneNumber=1234567890;
		Name="Shantanu";
		Address="Green Park Society";
		DataMember="son";
	}
	public void PrintSalary()
	{
		System.out.println("salary is: "+Salary);
	}
}
public class member 
{
	public static void main(String[] args) 
	{
		Member1 m1=new Member1();
		m1.setData();
		m1.PrintSalary();
		
	}
}
