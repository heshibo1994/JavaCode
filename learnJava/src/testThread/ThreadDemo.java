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
//        System.out.println("执行耗时流程");
//        new Thread(() -> {
//            int temp = 0;
//            for (int x = 0; x < Integer.MAX_VALUE; x++) {
//                temp += x;
//            }
//        }).start();
//        System.out.println("执行后续任务");
//        for(int num = 0;num<5;num++){
//            new Thread(()->{
//                for(int x = 0;x<10;x++){
//                    System.out.println(Thread.currentThread().getName()+":"+x);
//                    try{
//                        Thread.sleep(500);
//                    }catch(InterruptedException e){
//                        e.printStackTrace();
//                    }
//                }
//            },"线程对象—"+num).start();
//        }
//            Thread thread = new Thread(()->{
//                System.out.println("任务开始");
//                //执行5s
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("任务结束");
//            });
//            thread.start();
//            if (!thread.isInterrupted()){
//                thread.interrupt();
//            }
//        Thread mainThread = Thread.currentThread();
//        Thread thread = new Thread(()->{
//            for (int x = 0;x<100;x++){
//                if (x == 3){
//                    try {
//                        mainThread.join();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"x:"+x);
//            }
//        },"线程A:");
//        thread.start();
//        for (int x = 0;x<100;x++){
//            Thread.sleep(100);
//            System.out.println("主线程main："+x);
//        }

//        Thread mainThread = Thread.currentThread();
//        Thread thread = new Thread(()->{
//            for (int x = 0;x<100;x++){
//                if (x == 3){
//                    mainThread.yield();
//                }
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+"x:"+x);
//            }
//        },"线程A:");
//        thread.start();
//        for (int x = 0;x<100;x++){
//            Thread.sleep(100);
//            System.out.println("主线程main："+x);
//        }
//        Runnable run = ()->{
//            for (int x = 0;x<10;x++){
//                System.out.println(Thread.currentThread().getName()+": "+x);
//            }
//        };
//        Thread threadA = new Thread(run,"线程A");
//        Thread threadB = new Thread(run,"线程B");
//        Thread threadC = new Thread(run,"线程C");
//        threadA.setPriority(Thread.MAX_PRIORITY);
//        threadB.setPriority(Thread.MIN_PRIORITY);
//        threadC.setPriority(Thread.MIN_PRIORITY);
//        threadA.start();
//        threadB.start();
//        threadC.start();
//        System.out.println(Thread.currentThread().getPriority());
        MyTickets mt = new MyTickets();
        new Thread(mt,"线程A").start();
        new Thread(mt,"线程B").start();
        new Thread(mt,"线程C").start();


    }
}
