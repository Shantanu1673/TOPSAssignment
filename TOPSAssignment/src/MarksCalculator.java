package Oops;
abstract class Marks
{
    public abstract double getPercentage();
}

class A extends Marks
{
    private int subject1, subject2, subject3;

    public A(int subject1, int subject2, int subject3) 
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public double getPercentage()
    {
        int total = subject1 + subject2 + subject3;
        double percentage = (total / 300.0) * 100;
        return percentage;
    }
}

class B extends Marks 
{
    private int subject1, subject2, subject3, subject4;

    public B(int subject1, int subject2, int subject3, int subject4) 
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public double getPercentage() {
        int total = subject1 + subject2 + subject3 + subject4;
        double percentage = (total / 400.0) * 100;
        return percentage;
    }
}

public class MarksCalculator
{
	 public static void main(String[] args) 
	 {
	        A studentA = new A(85, 90, 78);
	        B studentB = new B(88, 76, 90, 85);

	        System.out.printf("Percentage of marks for Student A: %.2f%%%n", studentA.getPercentage());
	        System.out.printf("Percentage of marks for Student B: %.2f%%%n", studentB.getPercentage());
	 }
}
