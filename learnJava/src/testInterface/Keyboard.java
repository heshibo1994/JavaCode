package testInterface;

public class Keyboard implements IUSB {
    @Override
    public boolean check() {
        return true;
    }

    @Override
    public void work() {
        System.out.println("开始打字");
    }
}
