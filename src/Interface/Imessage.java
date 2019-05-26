package Interface;

interface Imessage {
    public static final String INFO = "hehsibo";//全局常量
    public  abstract String getInfo();//抽象方法
    public default boolean defaultconnect(){//普通方法
        System.out.println("建立消息的发送通道");
        return true;
    }
}