class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();//allowed
        a.sound(); // Calls Animal version
        Animal a = new Dog();  // Polymorphism
        a.sound();             // Calls Dog version
        Dog d = new Dog();//allowed
        d.sound(); // Calls Dog version
        
        Dog d = new Animal(); // ❌ Compile error - cannot assign parent to child
    }
}
