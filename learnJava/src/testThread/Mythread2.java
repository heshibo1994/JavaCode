package testThread;

import java.util.concurrent.Callable;

public class Mythread2 implements Callable<String>{
    @Override
    public String call() throws Exception {
        for (int x  = 0;x<10;x++){
            System.out.println(x);
        }
        return "线程结束";
    }
}
