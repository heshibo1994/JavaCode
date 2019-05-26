package Interface;

public class Print implements IUSB {
    public boolean check(){
        return false;
    }
    @Override
    public void work() {
        System.out.println("开始打印");;
    }
}
