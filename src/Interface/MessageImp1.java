package Interface;

public class MessageImp1 extends DatabaseAbstract implements Imessage,Ichannel{
    public  String getInfo() {
        if (this.getDatabaseAbstract()) {
            if (this.connect()) {
                return "MessageImp1的小消息";
            }
            return "无法连接channel，没有得到消息";
        }
        return "无法连接databaseabstract";
    }
    public boolean connect() {
        System.out.println("Channel的连接信息");
        return true;
    }
    public  boolean getDatabaseAbstract(){
        return true;
    }

}
