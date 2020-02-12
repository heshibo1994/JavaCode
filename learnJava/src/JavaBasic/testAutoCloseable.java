package JavaBasic;

public class testAutoCloseable {
    public static void main(String[] args) throws Exception{
        try {
            IMessage iMessage = new NetMessage("hello");
            iMessage.send();
        }catch (Exception e){}

    }
}
