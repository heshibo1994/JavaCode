package testThread;

public class ThreadDemo {
    public static void main(String[] args) {
        new Mythread("线程A").start();
        new Mythread("线程B").start();
        new Mythread("线程C").start();
    }
}
