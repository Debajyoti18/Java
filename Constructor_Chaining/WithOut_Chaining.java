/*Without Constructor Chaining
  1.Code repetition
  2.Harder to maintain 
  3.If logic changes, must update everywhere
 */

class Area {
    int length;
    int breadth;
    int height;

    public Area() {
        this.length = 1;
        this.breadth = 1;
        this.height = 1;
    }

    public Area(int side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.height = 1;
    }

    public Area(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void display() {
        System.out.println(length + " " + breadth + " " + height);
    }
}

public class Main {
    public static void main(String[] args) {

        Area a1 = new Area();
        Area a2 = new Area(5);
        Area a3 = new Area(5, 10);
        Area a4 = new Area(5, 10, 15);

        a1.display();
        a2.display();
        a3.display();
        a4.display();
    }
}
