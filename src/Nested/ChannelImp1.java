package Nested;

class ChannelImp1 implements IChannel  {
    @Override
    public void send(IMessage msg) {
        System.out.println("发送消息"+msg.getConnect());
    }
    class MessageImp1 implements IMessage{
        @Override
        public String getConnect() {
            return "heshibo";
        }
    }
}
