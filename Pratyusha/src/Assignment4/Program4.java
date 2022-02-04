package Assignment4;

public class Program4 { }

class rectangle {

    int length;
    int breadth;

    rectangle(int l , int b) {
        length = l;
        breadth = b;
    }

void area () {
    System.out.println("Area of a Rectangle = "+length*breadth);
}
 void perimeter() {
     System.out.println("Perimeter of a rectangle ="+ 2*length+2*breadth);
 }
}

class square extends rectangle {
    int side;
    square(int s) {
        super(5, 7);
        side = s;
     } 
     void squareArea() {
         System.out.println("Area of a square ="+(side*side));
     }
     void squarePerimeter() {
         System.out.println("Perimeter of a Square ="+(4*side));
     }
     public static void main(String[] args) {
         square aobj = new square(4);
         aobj.area();
         aobj.perimeter();
         aobj.squareArea();
         aobj.squarePerimeter();
         
     }
}
