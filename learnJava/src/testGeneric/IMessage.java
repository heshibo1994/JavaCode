package testGeneric;

public interface IMessage<T> {
    public String echo(T t);
}
