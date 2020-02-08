package testThread;

public class ThreadMethod implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}
