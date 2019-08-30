package Thread;

public class MyThread2 implements Runnable{
    private int ticket = 100;
    private String title;

    public void run(){
        for (int i= 0 ;i<100;i++){
            System.out.println("卖票，票有 "+this.ticket--);
        }
    }
}
