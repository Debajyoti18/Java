import java.util.*;

public class AutoBoxingMain {

    public static void main(String[] args) {

        //  Basic Autoboxing
        int a = 10;
        Integer objA = a;   // Autoboxing
        System.out.println("Autoboxing: " + objA);

        //  Basic Unboxing
        Integer objB = 20;
        int b = objB;       // Unboxing
        System.out.println("Unboxing: " + b);

        //  Wrapper Caching (-128 to 127)
        Integer x = 100;
        Integer y = 100;
        System.out.println("Wrapper caching (100==100): " + (x == y));  // true

        Integer m = 200;
        Integer n = 200;
        System.out.println("Outside cache (200==200): " + (m == n));    // false

        //  equals() vs ==
        System.out.println("equals(): " + m.equals(n)); // true

        

        //  Autoboxing in Collections
        List<Integer> list = new ArrayList<>();
        list.add(5);  // autoboxing internally Integer.valueOf(5)
        int value = list.get(0); // unboxing
        System.out.println("From list: " + value);

        //  Method Overloading Confusion
        testMethod(10);          // int version
        testMethod(Integer.valueOf(10)); // Integer version

        //  Immutability of Wrapper
        Integer p = 50;
        modify(p);
        System.out.println("Wrapper immutability: " + p);
    }

    static void testMethod(int x) {
        System.out.println("Primitive int method called");
    }

    static void testMethod(Integer x) {
        System.out.println("Wrapper Integer method called");
    }

    static void modify(Integer val) {
        val = val + 10;  // Creates new Integer object
    }
}
