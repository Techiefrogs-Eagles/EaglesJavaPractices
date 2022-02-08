package Assignment6;

public class Program6 {}

 abstract class Shape{
     abstract void RectangleArea(int l, int b);
     abstract void SquareArea(int s);
     abstract void CircleArea(int r);

 } 

 class Area extends Shape{
     void RectangleArea(int l, int b){
        System.out.println("The area of the Rectangle = "+(l*b));
     }

     void SquareArea(int s){
         System.out.println("The area of the Square ="+(s*s));
     }

     void CircleArea(int r){
         System.out.println("The area of the Circle ="+(3.14*r*r));
     }
     public static void main(String[] args) {
         Area areaobj = new Area();
         areaobj.RectangleArea(5, 10);
         areaobj.SquareArea(20);
         areaobj.CircleArea(4);
         
     }

    
    }
