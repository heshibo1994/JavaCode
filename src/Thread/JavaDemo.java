package Thread;

public class JavaDemo {
    public static void main(String[] args) {
//        System.out.println("run方法");
//        new MyThread ("线程A").run();
//        new MyThread ("线程B").run();
//        new MyThread ("线程C").run();
//        System.out.println("start方法");
//        new MyThread ("线程A").start();
//        new MyThread ("线程B").start();
//        new MyThread ("线程C").start();
//        System.out.println("start方法=========runnable");
//        Thread threadA = new Thread(new Mythread1("线程对象A"));
//        Thread threadB = new Thread(new Mythread1("线程对象B"));
//        Thread threadC = new Thread(new Mythread1("线程对象C"));
//        threadA.start();
//        threadB.start();
//        threadC.start();
            MyThread2 mt2 = new MyThread2();
            new Thread(mt2).start();
            new Thread(mt2).start();
            new Thread(mt2).start();
    }
}
