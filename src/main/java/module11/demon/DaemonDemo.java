package module11.demon;

public class DaemonDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " running " + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    //NOP
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish Thread " + Thread.currentThread().getName());
    }
}
