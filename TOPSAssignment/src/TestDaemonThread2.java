package MultiThreading;

class TestDaemonThread2 extends Thread 
{
    public void run() 
    {
        System.out.println("Daemon or non-daemon thread is running.");
    }

    public static void main(String[] args)
    {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();

        t1.setDaemon(true);  
        System.out.println("Is t1 daemon? " + t1.isDaemon());
        
        t1.start();
        t2.start();
    }
}

