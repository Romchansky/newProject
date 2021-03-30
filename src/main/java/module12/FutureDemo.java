package module12;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        FutureTask<Long> futureTask = new FutureTask<>(new CallableTask());
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get(3, TimeUnit.MINUTES));
        } catch (TimeoutException ex) {
            System.out.println("Join to TOE block");
            futureTask.cancel(true);
        }
    }
}

class CallableTask implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        final Instant start = Instant.now();
        Thread.sleep(100);
        final Instant end = Instant.now();
        Thread.sleep(2000);
        return Duration.between(start, end).toMillis();
    }
}
