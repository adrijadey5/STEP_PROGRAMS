abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

interface Fuel {
    void refuel();
}

class Car extends Vehicle implements Fuel {
    void start() {
        System.out.println("Car engine started.");
    }

    public void refuel() {
        System.out.println("Car is refueling...");
    }
}

public class Topic3_Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.refuel();
        c.stop();
    }
}
