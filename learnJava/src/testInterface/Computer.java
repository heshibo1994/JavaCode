package testInterface;

public class Computer {
    public void plugin(IUSB usb){
        if (usb.check()){
           usb.work();
        }
    }
}
