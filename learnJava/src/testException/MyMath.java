package testException;

public class MyMath {
    public static int div(int x,int y) throws Exception{
        int temp = 0;
        System.out.println("开始计算");
        try {
            temp = x / y;
        }catch (Exception e){
            throw e;
        }
        finally {
            System.out.println("结束计算");
        }
        return temp;
    }
}
