package JavaBasic;

public class NetMessage implements IMessage{
    private String name;
    public NetMessage(String name){
        this.name = name;
    }
    public boolean open(){
        System.out.println("打开服务");
        return true;
    }
    @Override
    public void send() {
        if(this.open()){
            System.out.println("发送服务"+this.name);
        }
    }


    public void close()throws Exception{
        System.out.println("关闭服务");
    }
}
