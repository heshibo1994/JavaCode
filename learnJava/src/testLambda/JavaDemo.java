package testLambda;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaDemo {
    public static void main(String[] args) {
        IMessage msg = ()->{
            System.out.println("hello,keran ");
        };
        msg.send();


        IMath math = (t1,t2)-> t1+t2;
        System.out.println(math.add(1,4));


        IFunction<Integer,String> fun = String::valueOf;
        String str = fun.change(100);
        System.out.println(str.length());


        Function<String,Boolean> f1 = "hello"::startsWith;
        System.out.println(f1.apply("h"));

        Consumer<String> f2 = System.out::println;
        f2.accept("hello");

        Supplier<String> f3 = "hello"::toUpperCase;
        System.out.println(f3.get());

        Predicate<String> f4 = "hello"::equalsIgnoreCase;
        System.out.println(f4.test("HeLLo"));
    }
}
