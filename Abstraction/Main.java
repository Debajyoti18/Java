
abstract class Vehicle {

    // Instance variable
    String brand;

    // Static variable
    static String category = "Transport";

    // Constructor (Yes! abstract class CAN have constructor)
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Constructor Called");
    }

    // Abstract method (must be implemented by child)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println(brand + " is stopping");
    }

    // Final method (cannot be overridden)
    final void fuelType() {
        System.out.println("Fuel type cannot be changed here");
    }

    // Static method
    static void generalInfo() {
        System.out.println("Vehicles are used for transportation");
    }
}


// Concrete class implementing abstract class
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
        System.out.println("Car Constructor Called");
    }

    // Must implement abstract method
    @Override
    void start() {
        System.out.println(brand + " Car starts with key ignition");
    }

    // Overriding concrete method
    @Override
    void stop() {
        System.out.println(brand + " Car stops using brakes");
    }
}


// Another child class
class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
        System.out.println("Bike Constructor Called");
    }

    @Override
    void start() {
        System.out.println(brand + " Bike starts with self-start");
    }
}


// Main Class
public class Main {

    public static void main(String[] args) {

        System.out.println("===== Static Method =====");
        Vehicle.generalInfo();

        System.out.println("\n===== Runtime Polymorphism =====");

        // Abstract class reference
        Vehicle v1 = new Car("Toyota");
        v1.start();   // Runtime polymorphism
        v1.stop();
        v1.fuelType();

        System.out.println();

        Vehicle v2 = new Bike("Honda");
        v2.start();
        v2.stop();
        v2.fuelType();

        System.out.println("\n===== Cannot Instantiate Abstract Class =====");
        // Vehicle v = new Vehicle();  // ❌ Compile-time error

        System.out.println("\n===== Access Static Variable =====");
        System.out.println("Category: " + Vehicle.category);

        System.out.println("\n===== Program Completed =====");
    }
}