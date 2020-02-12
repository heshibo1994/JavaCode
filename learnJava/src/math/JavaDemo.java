package math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class JavaDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1));
        System.out.println(Math.max(2,0.8));
        System.out.println(Math.round(12.45));


        Random rand = new Random();
        System.out.println(rand.nextInt(10));

        BigInteger bi1 = new BigInteger("123485938934324324234545432135454895839593573");
        BigInteger bi2 = new BigInteger("13485938934324324234545432135454895839593573");
        System.out.println(bi1.divide(bi2));
        BigDecimal bd = new BigDecimal(323);
    }


}
