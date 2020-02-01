package testInterface;


public class MessageImpl extends DatabaseAbstract implements IMessage,IChannel {
    public String getInfo(){
        if(connect()){
            if (getDatabaseConnection()){
                return "数据库连接成功，得到消息";
            }else{
                return "无法获取数据库";
            }
        }
        return "没有得到消息";
    }
    public boolean connect() {
        System.out.println("通道成功建立");
        return true;
    }

    @Override
    public boolean getDatabaseConnection() {
        return true;
    }
}
