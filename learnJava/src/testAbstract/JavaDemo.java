package testAbstract;

public class JavaDemo {
    public static void main(String[] args) {
        Message msg = new DatabaseMessage();
        System.out.println(msg.getConnectInfo());
    }
}
