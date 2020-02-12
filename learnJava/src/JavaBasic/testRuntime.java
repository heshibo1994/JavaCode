package JavaBasic;

public class testRuntime {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        //获取CPU内核数
        System.out.println(rt.availableProcessors());
        //获取空间
        System.out.println(rt.maxMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        //手工GC
        rt.gc();
    }
}
