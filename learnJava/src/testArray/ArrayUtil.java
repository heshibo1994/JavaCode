package testArray;

public class ArrayUtil {
    public static void changeArrat(int[] data) {
        for (int i = 0;i<data.length;i++) data[i] *= 2;
    }

    public static void printArray(int[] data) {
        for (int temp:data){
            System.out.println(temp);
        }
    }

    public static int[] initArray() {
        int arr [] = new int []{1,7,6,2,3,8,9,4,5};
        return arr;
    }
    public static int sum(int ... data){
        int sum = 0;
        for(int temp:data){
            sum+=temp;
        }
        return sum;
    }
}
