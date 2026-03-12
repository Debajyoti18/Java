class PetrolEngine {
    void start() {
        System.out.println("Petrol Engine Started");
    }
}

class Car {
    //The Car class is tightly coupled with PetrolEngine.
    /*
    If tomorrow you want: ElectricEngine , DieselEngine
       You must modify the Car class. That breaks a major design principle. */

    PetrolEngine engine = new PetrolEngine();

    void startCar() {
        engine.start();
    }
}