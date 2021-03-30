package module12;

import java.util.concurrent.Executor;

public class ExecutorsDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());

        Executor service = run -> new Thread(run).start();


        service.execute(runnable);

    }
}
