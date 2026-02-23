// class A {
//     void show() {
//         System.out.println("A");
//     }
// }

// class B extends A {}
// class C extends A {}
// // Not allowed
// class D extends B, C { }
// // D has the multiple datameber or method from B and C, so compiler doesn't know which one to call
 


//After Java 8, we can achieve this using interfaces
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C");
    }
}
class D implements B, C {
    //  if here we don't override show(), then compiler will throw error due to ambiguity (B and C both have show())
    @Override
    public void show() {
        //  Resolving conflict by overriding
      B.super.show();
    }
}
public class DimondProblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.show(); // Calls B's version due to override
    }
}
