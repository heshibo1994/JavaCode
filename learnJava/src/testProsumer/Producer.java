package testProsumer;

public class Producer implements Runnable{
    private Message msg;
    public Producer(Message msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int x = 0;x<100;x++){
            if (x%2 == 0){
                this.msg.set("A","a");
            }else{
                this.msg.set("B","b");
            }
        }
    }
}
