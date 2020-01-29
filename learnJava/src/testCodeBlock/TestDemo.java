package testCodeBlock;

public class TestDemo {
    public static void main(String[] args) {
        {
            int x = 10;
            System.out.println("x1: "+x);
        }
        int x = 100;
        System.out.println("x2: "+x);

    }
}
