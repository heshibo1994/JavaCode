package testInner;

public interface IChannel {
    public void send(IMessage msg);
    interface IMessage{
        public String getConnect();
    }
}
