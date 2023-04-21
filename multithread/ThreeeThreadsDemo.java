package multithread;

class TestThread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                sleep(500);
                System.out.print(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(": "+i);
        }
    }
}
public class ThreeeThreadsDemo {
    public static void main(String args[])
    {
        TestThread thread0=new TestThread();
        TestThread thread1=new TestThread();
        TestThread thread2=new TestThread();
        thread1.start();

        try {
            thread0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
        thread2.start();

    }
}
