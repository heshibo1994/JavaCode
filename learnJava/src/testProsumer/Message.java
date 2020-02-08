package testProsumer;

import testWrapper.Int;

public class Message {
    private String title;
    private String content;
    private boolean flag;
    //true 允许生产   false 允许消费

    public synchronized String get() {
        if(this.flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            return this.title+"-"+this.content;
        }finally{
            this.flag = true;
            super.notify();
        }
    }

    public synchronized void set(String title,String content){
        if(!this.flag){//无法生产，等待消费
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.content = content;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.title = title;
        this.flag = false;//生产完毕，等待消费
        super.notify();
    }

}
