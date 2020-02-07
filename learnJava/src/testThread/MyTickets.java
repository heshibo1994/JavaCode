package testThread;

public class MyTickets implements Runnable{
    private int ticket = 5;
    private String title;
//    public MyTickets(String title){
//        this.title = title;
//    }

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            if (this.ticket>0){
                System.out.println("title= " + this.ticket--);
            }
        }
    }
}
