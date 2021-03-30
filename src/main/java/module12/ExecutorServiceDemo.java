package module12;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        fixedThreadPool();
        cachedThreadPool();
    }

    private static void cachedThreadPool() throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Callable<String> task = () -> {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(100);
            return "Done";
        };

        List<Callable<String>> tasks = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> task)
                .collect(Collectors.toList());


        service.invokeAll(tasks);
        service.shutdown();

    }

    private static void fixedThreadPool() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(100);
            return "Done";
        };

        List<Callable<String>> tasks = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> task)
                .collect(Collectors.toList());


        service.invokeAll(tasks);
        service.shutdown();
    }
}
