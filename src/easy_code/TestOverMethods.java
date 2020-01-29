package easy_code;

public class TestOverMethods {
    public static void main(String[] args) {
        TestOverMethods testOverMethods = new TestOverMethods();
        testOverMethods.methodForOverLoad(7);
        testOverMethods.methodForOverLoad(new Integer(7));
}
    public void overloadMethod(){
        System.out.println("无参方法");
    }
    public void methodForOverLoad(int param){
        System.out.println("参数为基本类型int的方法");
    }
    public void methodForOverLoad(Integer param){
        System.out.println("参数为包装类型Integer的方法");
    }
    public void methodForOverLoad(Integer... param){
        System.out.println("可变参数方法");
    }
    public void methodForOverLoad(Object param){
        System.out.println("参数为object得到方法");
    }
}
