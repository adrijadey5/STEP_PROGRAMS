// LAB PROBLEM 2: toString() and getClass() Usage

class Car {
    String brand;
    String model;
    double price;

    // Constructor
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Overriding toString() for readable output
    @Override
    public String toString() {
        return "Car Details: " + brand + " " + model + " | Price: ₹" + price;
    }
}

public class CarInfo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Fortuner", 4500000);

        // Printing object directly invokes toString()
        System.out.println(car);

        // Using getClass() to print runtime class name
        System.out.println("Class Name: " + car.getClass().getName());
    }
}
