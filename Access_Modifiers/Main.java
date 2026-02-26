class Parent {

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    public void accessPrivateInsideClass() {
        privateMethod(); // allowed inside same class
    }
}

class Child extends Parent {

    //  Cannot override private method
    // privateMethod();  // Not visible

    // Can override default
    @Override
    void defaultMethod() {
        System.out.println("Overridden Default Method");
    }

    // Can override protected
    @Override
    protected void protectedMethod() {
        System.out.println("Overridden Protected Method");
    }

    // Can override public
    @Override
    public void publicMethod() {
        System.out.println("Overridden Public Method");
    }
}

public class VisibilityDemo {

    public static void main(String[] args) {

        Child child = new Child();

        child.defaultMethod();
        child.protectedMethod();
        child.publicMethod();

        // child.privateMethod();  Not accessible
    }
}