package Exception;

public class JavaDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 90);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("执行完毕");

        try {
            System.out.println(Mymath.div(10, 0));
        }catch (Exception e ) {
            e.printStackTrace();
        }
    }

}
