package testInterface;

public class JavaDemo {
    public static void main(String[] args) {
        IMessage msg = new MessageImpl();
        System.out.println(msg.getInfo());


        Computer computer = new Computer();
        computer.plugin(new Keyboard());
        computer.plugin(new Print());


        IFood food = Factory.getInstace(args[0]);
        food.eat();
    }
}
