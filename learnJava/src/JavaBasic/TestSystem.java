package JavaBasic;

public class TestSystem {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        String str = "";
        for(int x = 0;x<30000;x++){
            str = str+x;
        }
        long endtime = System.currentTimeMillis();
        System.out.println("耗时："+(endtime-starttime));
    }
}
