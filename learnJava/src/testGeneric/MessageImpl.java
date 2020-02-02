package testGeneric;

public class MessageImpl<S> implements IMessage<S> {
    @Override
    public String echo(S s) {
        return "echo"+s;
    }
}
