package testThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
//        new Mythread("线程A").start();
//        new Mythread("线程B").start();
//        new Mythread("线程C").start();

//        Thread threadA = new Thread(new Mythread1("runnableA接口"));
//        Thread threadB = new Thread(new Mythread1("runnableB接口"));
//        Thread threadC = new Thread(new Mythread1("runnableC接口"));
//        threadA.start();
//        threadB.start();
//        threadC.start();


//        for(int x = 0;x<3;x++){
//            String title = "线程对象-"+x;
//            Runnable run = ()->{
//                for (int y = 0 ;y<10;y++){
//                    System.out.println(title+":"+y);
//                }
//            };
//            new Thread(run).start();
//        }
//            MyTickets myTickets = new MyTickets();
//            new Thread(myTickets).start();
//            new Thread(myTickets).start();
//            new Thread(myTickets).start();


//        FutureTask<String> task = new FutureTask<String>(new Mythread2());
//        new Thread(task).start();
//        System.out.println(task.get());

//            ThreadMethod tm = new ThreadMethod();
//            new Thread(tm,"线程A").start();
//            new Thread(tm,"线程B").start();
//            new Thread(tm).start();
        System.out.println("执行耗时流程");
        new Thread(() -> {
            int temp = 0;
            for (int x = 0; x < Integer.MAX_VALUE; x++) {
                temp += x;
            }
        }).start();
        System.out.println("执行后续任务");

    }
}
