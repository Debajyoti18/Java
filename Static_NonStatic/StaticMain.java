public class StaticMain {

    //  Static Variable (Class level)
    static int staticVar = 100;

    //  Non-static Variable (Instance level)
    int nonStaticVar = 200;

    //  Static Block (Runs when class loads) run before main method
    static {
        System.out.println("Static Block Executed");
        staticVar = 500;
    }

    //  Instance Block (Runs when object is created, before constructor)
    {
        System.out.println("Instance Block Executed");
        nonStaticVar = 300;
    }

    //  Constructor
    public StaticMain() {
        System.out.println("Constructor Executed");
    }

    //  Static Method
    public static void staticMethod() {
        System.out.println("Inside Static Method");

        // Can access static variable directly
        System.out.println("Access staticVar: " + staticVar);

        // Cannot access nonStaticVar directly
        // System.out.println(nonStaticVar); ❌ Compile error

        // To access non-static, create object
        StaticMain obj = new StaticMain();
        System.out.println("Access nonStaticVar via object: " + obj.nonStaticVar);
    }

    //  Non-static Method
    public void nonStaticMethod() {
        System.out.println("Inside Non-Static Method");

        // Can access both
        System.out.println("Access staticVar: " + staticVar);
        System.out.println("Access nonStaticVar: " + nonStaticVar);
    }

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        // Static variable access
        System.out.println("Static variable: " + staticVar);

        // Static method call
        staticMethod();

        // Non-static requires object
        StaticMain obj = new StaticMain();
        System.out.println("Non-static variable: " + obj.nonStaticVar);
        obj.nonStaticMethod();
    }
}
