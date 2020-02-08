package testProsumer;

public class Consumer implements Runnable {
    Message msg;
    public Consumer(Message msg){
        this.msg = msg;
    }
    @Override
    public void run() {
        for (int x = 0;x<100;x++){
            System.out.println(this.msg.get());
        }
    }
}
