package module12;


import java.time.Instant;
import java.util.concurrent.CountDownLatch;


public class CountDownLatchDemo {
    private static CountDownLatch service = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new LatchThread(service));
            thread.start();
        }
        Thread.sleep(1000);
        System.out.println("Finish main thread");
        service.countDown();
    }
}

class LatchThread implements Runnable {


    private CountDownLatch latch;

    public LatchThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println("Start Thread: " + Thread.currentThread().getName());
            System.out.println("Time thread: " + Instant.now().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}