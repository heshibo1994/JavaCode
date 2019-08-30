package easy_code;

public class TestLambda {
    public static void main(String[] args) {
        TestLambda tl = new TestLambda();
        // 包含类型声明
        MathOperation addition1 = (int a,int b) -> a + b;
        // 不包含类型声明
        MathOperation addition2 = (a, b) -> a - b;
        // 包含返回
        MathOperation addition3 = (a, b) -> {return a*b;};
        // 包含返回,但没有
        MathOperation addition4 = (a, b) ->  a/b;

        System.out.println(tl.operate(2,3,addition1));
        System.out.println(tl.operate(2,3,addition2));
        System.out.println(tl.operate(2,3,addition3));
        System.out.println(tl.operate(2,3,addition4));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("ALI");
        greetService2.sayMessage("BABA");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
