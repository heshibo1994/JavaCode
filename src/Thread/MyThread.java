package Thread;

public class MyThread extends Thread {
    private String title;
    public MyThread(String title){
        this.title= title;
    }
    public void run(){
        for (int i= 0 ;i<10;i++){
            System.out.println(this.title+"运行：i = "+i);
        }
    }
}
