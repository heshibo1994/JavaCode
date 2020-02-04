package testInner;

public class Outer1 {
    private String msg ="bbb";
    public void fun(long time){
        class Inner {
            public void print(){
                System.out.println(Outer1.this.msg);
                System.out.println(time);
            }
        }
        // 方法中直接实例化内部类对象
        new Inner().print();
    }
}
