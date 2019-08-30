package alibaba;

import static java.lang.Character.MIN_VALUE;
import static java.lang.Float.MAX_VALUE;
import static java.lang.Float.MIN_NORMAL;

public class FloatTest {
    public static void main(String[] args) {
        float a = 1.0f;
        float b = 0.9f;
        System.out.println(a-b);

        String aa = Integer.toBinaryString(Float.floatToIntBits(0.1f));
        System.out.println("aaaa"+aa);



        int c = Integer.valueOf("01111111011111111111111111111111", 2);
        float cc = Float.intBitsToFloat(c);
        System.out.println(cc);
        int d = Integer.valueOf("01111111111111111111111111111111", 2);
        float dd = Float.intBitsToFloat(c);
        System.out.println(cc);
        int e = Integer.valueOf("01111111100000000000000000000000", 2);
        float ee = Float.intBitsToFloat(c);
        System.out.println(cc);

        // 0-01111111-1.00000000000000000000000 = 128-1 = 127 - 127 = 0 2零次方=1 * 1.0 = 1.0
        // 0-01111110-1.11001100110011001100110 = 126-127=-1       0.5 * 1.799999999999 = 0.899999999




        //int e = Integer.valueOf("0 10110111 -11001100110011001111111", 2);
        //int e = Integer.valueOf("0  000000000000000000000000000001", 2);
        //int e = Integer.valueOf("0000000000000000000000000000001", 2);
        //int e = Integer.valueOf("1111111111111111111111111111111", 2);






        System.out.println(MIN_NORMAL/(MIN_VALUE*1.0));

        double d1 = 0.1;
        float f1 = 0.1f;
        System.out.println(d1 == (double)f1);
        System.out.println((float)d1 == f1);

        double d2 = 0.5;
        float f2 = 0.5f;
        System.out.println(d2 == (double)f2);
        System.out.println((float)d2 == f2);

        System.out.println(1.0/0.0);
        System.out.println(1.0/0);
        System.out.println(1/0.0);
        System.out.println(0.0/0.0);
        //System.out.println(1/0);

        float aaaa = 0.123456789123f;
        System.out.println(aaaa);

        if (Double.MAX_VALUE == Double.MAX_VALUE+200){
            System.out.println("fds");
        }

    }
}
