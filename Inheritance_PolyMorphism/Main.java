class Vehicle {

    //  Instance variables
    String brand;
    int speed;

    //  Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle Constructor Called");
    }

    //  Instance method
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {

    String fuelType;

    //  Constructor (calls parent constructor)
    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);  // must be first line
        this.fuelType = fuelType;
        System.out.println("Car Constructor Called");
    }

    //  Method overriding
    @Override
    public void start() {
        System.out.println("Car is starting with key ignition...");
    }

    //  Car-specific method
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Main Started");

        //  Creating Car object
        Car car1 = new Car("Toyota", 120, "Petrol");

        //  Calling overridden method
        car1.start();

        car1.displayDetails();

        System.out.println("---- Polymorphism ----");

        //  Polymorphism (Dynamic Method Dispatch)
        Vehicle v = new Car("BMW", 180, "Diesel");
        v.start();  // Calls Car's overridden method
    }
}
/*
Main Started
Vehicle Constructor Called 
Car Constructor Called
Car is starting with key ignition...
Brand: Toyota
Speed: 120
Fuel Type: Petrol
---- Polymorphism ----
Vehicle Constructor Called
Car Constructor Called
Car is starting with key ignition... */
