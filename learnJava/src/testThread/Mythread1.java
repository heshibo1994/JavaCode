package testThread;

public class Mythread1 implements Runnable {
    private String title;
    public  Mythread1(String title){
        this.title = title;
    }
    @Override
    public void run() {
        for(int i =0;i<10;i++){
            System.out.println(this.title+":"+i);
        }
    }
}
