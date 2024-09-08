package MultiThreading;

class TestThreadTwice1 extends Thread
{
    public void run()
    {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args)
    {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        try {
            
            t1.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

