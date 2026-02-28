public abstract Car{
    abstract void refurel();
    abstract void engineType();
}
public class PetrolCar extends Car {
    @Override
    void refurel() {
        System.out.println("Petrol car refueling at petrol station");
    }

    @Override
    void engineType() {
        System.out.println("Petrol car has a petrol engine");
    }
}
Public class DieselCar extends Car {
    @Override
    void refurel() {
        System.out.println("Diesel car refueling at diesel station");
    }

    @Override
    void engineType() {
        System.out.println("Diesel car has a diesel engine");
    }
}
public class Main {
    public static void main(String[] args) {
        Car petrolCar = new PetrolCar();
        petrolCar.refurel();
        petrolCar.engineType();

        Car dieselCar = new DieselCar();
        dieselCar.refurel();
        dieselCar.engineType();
    }
}