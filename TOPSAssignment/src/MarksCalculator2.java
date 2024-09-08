package Oops;

import java.util.Scanner;

abstract class Marks1
{
    abstract void getPercentage();
}

class A1 extends Marks1
{
    private int subject1, subject2, subject3;

    public A1(int subject1, int subject2, int subject3)
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    void getPercentage() 
    {
        int percentage = (subject1 + subject2 + subject3) / 3;
        System.out.println("Percentage of Student A: " + percentage + "%");
    }
}

class B1 extends Marks1
{
    private int subject1, subject2, subject3, subject4;

    public B1(int subject1, int subject2, int subject3, int subject4)
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    void getPercentage() {
        int percentage = (subject1 + subject2 + subject3 + subject4) / 4;
        System.out.println("Percentage of Student B: " + percentage + "%");
    }
}

public class MarksCalculator2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Student A in three subjects:");
        System.out.print("Subject 1: ");
        int a1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int a2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int a3 = scanner.nextInt();

        A1 studentA = new A1(a1, a2, a3);
        studentA.getPercentage();

        System.out.println("Enter marks for Student B in four subjects:");
        System.out.print("Subject 1: ");
        int b1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int b2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int b3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int b4 = scanner.nextInt();

        B1 studentB = new B1(b1, b2, b3, b4);
        studentB.getPercentage();

        scanner.close();
    }
}
