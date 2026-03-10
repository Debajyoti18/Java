interface Shape{
    void draw(); // common for all shapes
}
class Circle implements Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class Square implements Shape{
    @Override
    void draw(){
        System.out.println("Drawing Square");
    }
}
class Rectangle implements Shape{
    @Override
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
// Factory class : This class decides which object to create.
class ShapeFactory {
   public static Shape getShape(Shape shapeType){
        if( shapeType == null ){
            return null;
        } if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }

        else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }

        return null;
   }
}
public class FactoryMain{
   public static void main(String[] args) {

       /*
       Circle c = new Circle(); No need to create direct object .let factory to create
        */
       Shape s1 = ShapeFactory.getShape("Circle");
       s1.draw();
       Shape s1 = ShapeFactory.getShape("rectangle");
       s1.draw();
       Shape s1 = ShapeFactory.getShape("square");
       s1.draw();
    }
}