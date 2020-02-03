package testThread;

public class Mythread extends Thread {
    private String title;
    public Mythread(String title){
        this.title = title;
    }
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println(this.title+":"+i);
        }
    }
}
