class Area{
    int length;
    int breadth;
    int height;
    public Area(){
        //First statement inside constructor

       this(1);
    }
    public Area(int side){
       this(side,side,side);
    }
    public Area(int length, int breadth){
       this(length,breadth,1);
    }
    public Area(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
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