 package Abstraction;
 
 public interface Engine {
      void start();
 }
 public class PetrolEngine implements Engine {
    @Override
    void start(){
        System.out.println("Engine Started with Petrol Engine");
    }
    
 }
 public class DieselEngine implements Engine {
    @Override
    void start(){
        System.out.println("Engine Started with Diesel Engine");
    }
    
 }
 class Car{
    // Inject dependency from outside
    private Engine engine;
    Car(Engine engine){
        this.engine = engine;
    }
    void startCar(){
        engine.start();
    }
 }


public class LooseCouplingMain{
    public static void main(String[] args) {
        Engine petrolengine = new PetrolEngine();
        Car audi = new Car(petrolengine);
        audi.startCar();
        //IN future if want to add ElecticEngine then Car class code won't change 
        //This follows open/close patten i.e Open for Extension and closed for Modification
    }
}