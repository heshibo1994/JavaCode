package testException;

import testWrapper.Int;

public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println("程序计算：" + (x / y));
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
}
