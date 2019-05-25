package Abstract;

public class JavaDemo {
    public static void main(String[] args) {
        Message  msg=new DataBaseMessage();
        msg.setType("客户消息");
        System.out.println(msg.getConnectInfo());
        System.out.println(msg.getType());
    }
}
