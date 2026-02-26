import java.util.ArrayList;

// Final class (cannot be extended)
final class FinalClass {
    void display() {
        System.out.println("Inside Final Class");
    }
}

// Parent class
class Parent {

    // Final variable
    final int fixedValue = 100;

    // Blank final variable
    final int blankFinal;

    // Constructor initializing blank final variable
    Parent(int value) {
        blankFinal = value;
    }

    // Final method (cannot be overridden)
    final void finalMethod() {
        System.out.println("This is a final method from Parent");
    }

    void normalMethod() {
        System.out.println("This is a normal method from Parent");
    }
}

// Child class
class Child extends Parent {

    Child(int value) {
        super(value);
    }

    //  Cannot override final method
    // void finalMethod() { }

    //  Can override normal method
    @Override
    void normalMethod() {
        System.out.println("Overridden normal method in Child");
    }
}

public class FinalKeywordDemo {

    // static final variable (constant)
    static final double PI = 3.14159;

    public static void main(String[] args) {

        System.out.println("===== FINAL VARIABLE =====");
        final int x = 10;
        System.out.println("Final primitive value: " + x);
        // x = 20; ❌ Error

        System.out.println("\n===== FINAL REFERENCE VARIABLE =====");
        final ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring Boot");
        System.out.println("List contents: " + list);
        // list = new ArrayList<>(); ❌ Error

        System.out.println("\n===== BLANK FINAL VARIABLE =====");
        Parent parent = new Parent(500);
        System.out.println("Blank final initialized value: " + parent.blankFinal);

        System.out.println("\n===== FINAL METHOD =====");
        Child child = new Child(300);
        child.finalMethod();   // Inherited but not overridden
        child.normalMethod();  // Overridden method

        System.out.println("\n===== FINAL CLASS =====");
        FinalClass fc = new FinalClass();
        fc.display();

        System.out.println("\n===== STATIC FINAL =====");
        System.out.println("Value of PI: " + PI);

        System.out.println("\n===== STRING IMMUTABILITY =====");
        final String name = "Debajyoti";
        System.out.println("Name: " + name);
        // name = "DJ"; ❌ Error

        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}