class Area {

    //  Area of Circle
    void calculateArea(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    //  Area of Rectangle
    void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    //  Area of Square
    void calculateArea(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class OverLoading {
    public static void main(String[] args) {

        Area obj = new Area();
        // Early binding: Compiler binds with  method signature accordingly
        obj.calculateArea(5);        // Square
        obj.calculateArea(10, 20);   // Rectangle
        obj.calculateArea(7.0);      // Circle
    }
}
