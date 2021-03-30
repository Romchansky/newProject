package module5;

public class Car {
    private Door[] doors;
    private Wheel[] wheels;


    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    static class Door {
        static Integer integer = 10;
    }

    static class Wheel {

    }
}

class CarTest {
    public static void main(String[] args) {
        int a = 0;
        Car car = new Car();
        Car.Door[] doors = new Car.Door[4];
        car.setDoors(doors);
        Car.Door.integer =a;
    }

}
