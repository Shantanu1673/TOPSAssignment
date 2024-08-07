abstract class Bank
{
	public abstract void getBalance();
	
}
class BankA extends Bank
{
	public void getBalance()
	{
		System.out.println("Bank A Diposited $100");
	}
}
class BankB extends Bank
{
	public void getBalance()
	{
		System.out.println("Bank B Diposited $150");
	}
}
class BankC extends Bank
{
	public void getBalance()
	{
		System.out.println("Bank C Diposited $200");
	}
}
public class Banks
{
	public static void main(String[] args) 
	{
		BankA b1=new BankA();
		b1.getBalance();
		BankB b2=new BankB();
		b2.getBalance();
		BankC b3=new BankC();
		b3.getBalance();
		
		
	}
}
