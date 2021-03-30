package module11.notify_all;

public class ParkingDemo {
    Parking parking = new Parking(5);

    public static void main(String[] args) {
        ParkingDemo parkingDemo = new ParkingDemo();

        for (int i = 0; i < 15; i++) {
            Thread car = new Thread(() -> {
                try {
                    parkingDemo.parking();
                } catch (InterruptedException e) {
                    //NOP
                }
            });
            car.start();
        }
    }

    public void parking() throws InterruptedException {
        parking.JoinParking();
        //Машина заблокировала место
        System.out.println("Машина " + Thread.currentThread().getName() + " заехала на парковку");
        Thread.sleep(3000);
        parking.leaveParking();
        System.out.println("Машина " + Thread.currentThread().getName() + " выехала с парковки");
    }
}
