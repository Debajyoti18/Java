class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Bird chirps");
    }
}

public class PolymorphismMain{
     public static void main(String[] args) {
        /*
        Without polymorphism:

            Dog d = new Dog();
            Cat c = new Cat();
            Bird b = new Bird();

            d.makeSound();
            c.makeSound();
            b.makeSound();

            You must handle each class separately.
 */
        // With Polymorphism One Parent reference Type handles Multiple childs
        // Actual Beauty of Polymorphism
        //So in code terms, polymorphism lets us write less code, reuse more, and 
        // add new animal types in the future without changing your existing code at all.
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Bird()
        };

        for(Animal a : animals) {
            a.makeSound();
        }
    }
}