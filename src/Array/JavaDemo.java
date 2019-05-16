package Array;
public class JavaDemo {
    public static void main(String[] args) {
        int a [] = new int []{2,3,5,7,2,1,10};
        ArrayUtil jd  = new ArrayUtil(a);
        System.out.println(jd.getSum());
        System.out.println(jd.getMax());
        System.out.println(jd.getAvg());
        System.out.println(jd.getMin());
        java.util.Arrays.sort(a);//
        ArrayUtil.printArray(a);

        ArrayUtil.printArray(a);
        ArrayUtil.transform(a);//装置
        ArrayUtil.printArray(a);

        java.util.Arrays.sort(a);//排序
        ArrayUtil.printArray(a);
        int b [] = new int []{22,33,55,77,22,11,110};
        System.arraycopy(a,0,b,3,2);
        ArrayUtil.printArray(b);

        //对象数组
        Person p[] = new Person[3];
        p[0] = new Person("he",23);
        p[1] = new Person("she",32);
        p[2] = new Person("bo",25);
        for (Person i:p){
            i.tell();
        }



    }
}
