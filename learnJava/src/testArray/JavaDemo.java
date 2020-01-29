package testArray;

import javax.naming.ldap.PagedResultsControl;

import static java.util.Arrays.sort;

public class JavaDemo{
    public static void main(String[] args) {
//        int data [] = new int [3];
//        data[0]  = 10;
//        data[1]  = 20;
//        data[2]  = 30;
        //System.out.println(data[0]);
        //System.out.println(data[3]);
//        int data [] = new int [] {10,20,30};
//        int temp [] = data;
//        temp[0] = 99;
//        System.out.println(data[0]);
//        for(int t:data){
//            System.out.println(t);
//        }

//    int data[][] = new int[][]{{1, 2, 3}, {2, 3, 4}};
//    for (int i = 0; i < data.length; i++)
//        for (int j = 0; j < data[i].length; j++) {
//            System.out.println(data[i][j]);
//        }
//    }
        int data[] = ArrayUtil.initArray();
        System.out.println(ArrayUtil.sum(7,8,9,10,13));
        sort(data);
        ArrayUtil.printArray(data);
        ArrayUtil.changeArrat(data);
        ArrayUtil.printArray(data);

        Person per [] = new Person[]{
            new Person("keran",23),
            new Person("keran",24),
            new Person("keran",25),
        };
        for (int i= 0;i<per.length;i++){
            System.out.println(per[i].toString());
        }
    }



}
