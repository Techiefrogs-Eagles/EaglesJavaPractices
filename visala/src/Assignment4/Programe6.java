package Assignment4;

public class Programe6 {}

class Shape
{
    void shape()
    {
        System.out.println("This is Shape");

    }

}




class Rectangle extends Shape{
    void rectangle()
    {
        System.out.println("This is Rectangle Shape");
    }

}


class Circle extends Shape
{
void circle()
{
    System.out.println("This is Circle Shape");
}
}

class Square1 extends Rectangle{
    void square()
    {
        System.out.println("Square of Rectangle");
        
    }
    public static void main(String[] args) {
        Square1 Sqobj=new Square1();
      
        Sqobj.rectangle();
        Sqobj.shape();
    }
}