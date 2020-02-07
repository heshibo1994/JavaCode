package testInner;

public interface IMessage {
    public void send(String msg);
    public static IMessage getInstance(){
        return new IMessage() {
            @Override
            public void send(String msg) {
                System.out.println(msg);
            }
        };
    }
}
