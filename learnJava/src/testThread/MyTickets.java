package testThread;

public class MyTickets implements Runnable{
    private int ticket = 1000;
//    private String title;
//    public MyTickets(String title){
//        this.title = title;
//    }

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (this.ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "余票：" + ticket--);
                } else {
                    System.out.println("票卖光了");
                    break;
                }
            }
        }
    }
}
