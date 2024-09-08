
package MultiThreading;

public class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running using Runnable interface.");
    }

    public static void main(String[] args)
    {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

