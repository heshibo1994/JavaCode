package testOverride;

public class DatabaseChannel extends Channel {
    public void connect(){
        super.connect();
        System.out.println("子类进行数据库进行链接");
    }
}
