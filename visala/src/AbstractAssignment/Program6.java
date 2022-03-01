package src.AbstractAssignment;

//import AbstractAssignment.Program6.Shape;

public class Program6 {}
    abstract class Shape
    {
        abstract void Rectanglearea(int l,int b);
        abstract void Squrearea(int s);
        abstract void Circlearea(int r);

    }



class Area extends Shape
{


  
    void Rectanglearea(int l, int b) 
    {
        
        System.out.println("Area of Rectangle="+(l*b));

    }

    void Squrearea(int s) {
       System.out.println("Area of Squre="+(s*s));
       
        
    }

    
    void Circlearea(int r) {
        System.out.println("Area of Circle="+(3.14*r*r));
        
        
    }
    public static void main(String[] args) {
        Area Aobj= new Area();
        Aobj.Rectanglearea(3, 4);
        Aobj.Squrearea(5);
        Aobj.Circlearea(6);
    }

}