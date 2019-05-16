package Array;

public class JavaDemo {
    public static void main(String[] args) {
        int a [] = new int []{2,3,5,7,2,1,10};
        ArrayUtil jd  = new ArrayUtil(a);
        System.out.println(jd.getSum());
        System.out.println(jd.getMax());
        System.out.println(jd.getAvg());

    }
}
