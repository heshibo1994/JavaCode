package Array;
public class Array {
    public static  void main(String args[]){
        //字符和字符串
        char c =  'A';
        char ch = (char) (c+32);
        System.out.println(ch);
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1+s2;
        System.out.println(s3);

        //数组
        int a[] = new int[]{1,3,5};
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //使用foreach
        for (int temp:a){
            System.out.println(temp);
        }

        System.out.println();
        //二维数组
        int b [][] = new int[][]{{1,2,3,4,5},{1,2,3},{1,2,3,4}};
        for (int i =0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.println(b[i][j]);
            }
            System.out.println();
        }
        for (int temp []: b){
            for (int num :temp){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        //数组和方法
        int d [] = initArray();//初始化数组
        printArray(d);
        changeArray(d);
        printArray(d);

    }
    public static void printArray(int [] temp){//输出
        for (int i :temp){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void changeArray(int [] temp) {//修改数组
        System.out.println("进行修改");
        for (int i = 0;i<temp.length;i++) {
            temp[i] *=2;
        }
    }
    public static int [] initArray(){//初始化
        int arr [] = new int []{1,2,3,7,8,9};
        return arr;
    }
}
