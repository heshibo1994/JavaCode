package testInner;

public class ChannelImpl implements IChannel {
    @Override
    public void send(IMessage msg) {
        System.out.println(msg.getConnect());
    }
    class MessageImpl implements IMessage{
        @Override
        public String getConnect() {
            return "aaa";
        }
    }
}
