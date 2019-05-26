package Interface;

public class JavaDemo {
    public static void main(String[] args) {
        Imessage msg = new MessageImp1();
        Ichannel chl = (Ichannel) msg;

        if (msg.defaultconnect()){
            System.out.println(msg.getInfo());
        }
        System.out.println(chl.connect());

        System.out.println(msg.getInfo());
        System.out.println(Imessage.INFO);

        Computer computer = new Computer();
        computer.plugin(new KeyBoard());
        computer.plugin(new Print());

        //工厂模式
        Ifood food = Factory.getInstance(args[0]);
        food.eat();
    }
}
