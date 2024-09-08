package MultiThreading;

class MyThread1 extends Thread 
{
    public void run() 
    {
        try {
            System.out.println("Thread 1 is running.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread2 extends Thread 
{
    public void run()
    {
        try {
            System.out.println("Thread 2 is running.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        
        thread1.start();
        thread2.start();
    }
}

