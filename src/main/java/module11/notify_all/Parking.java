package module11.notify_all;

public class Parking {
    private int amountCars = 0;
    private int blockedPlaces = 0;
    private final Object monitor = new Object();

    public Parking(int amountCars) {
        this.amountCars = amountCars;
    }

    public void JoinParking() throws InterruptedException {
        synchronized (monitor) {
            while (blockedPlaces == amountCars) {
                System.out.println("Parking is full");
                monitor.wait();
            }
            blockedPlaces++;
            monitor.notifyAll();
        }
    }

    public void leaveParking() throws InterruptedException {
        synchronized (monitor) {
            while (blockedPlaces == 0) {
                monitor.wait();
            }
            blockedPlaces--;
            monitor.notifyAll();
        }
    }

}
