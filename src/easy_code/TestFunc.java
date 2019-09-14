package easy_code;


public class TestFunc {
    private static int intStatic = 222;
    private static String stringStatic = "old string";
    private static StringBuilder stringBuilderStatic = new StringBuilder("old stringbuilder");

    public static void main(String[] args) {
        method(intStatic);
        method(stringStatic);
        method(stringBuilderStatic,stringBuilderStatic);

        // 输出intStatic = 222
        System.out.println(intStatic);
        method();
        // 输出intStatic = 888
        System.out.println(intStatic);

        // 输出stringStatic = old string
        System.out.println(stringStatic);
        System.out.println(stringBuilderStatic);



    }

    private static void method() {
        intStatic = 888;
    }

    private static void method(StringBuilder stringBuilderStatic1, StringBuilder stringBuilderStatic2) {
        // 直接使用参数引用修改对象
        stringBuilderStatic1.append(".method.first-");
        stringBuilderStatic2.append(".method.second-");

        // 引用重新赋值
        stringBuilderStatic1 = new StringBuilder("new stringBulider");
        stringBuilderStatic1.append("new method's append");


    }

    private static void method(String stringStatic) {
        stringStatic = "new string";
    }

    private static void method(int intStatic) {
        intStatic = 777;
    }


}
