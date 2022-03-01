package src.Assignment4;;

public class Program4 {}
    class Rectangle1
    {
int length;
int breadth;
int area;
Rectangle1( int l,int b)
{
    length=l;
    breadth =b;
    area=length*breadth;
}

void area()
{
    System.out.println("Area of Rectangle="+area);

}
void perimeter()
{
    System.out.println("Perimeter of Rectangle="+((2*length)+(2*breadth)));
}

    }




    class Square extends Rectangle1
{
    int side;
Square(int s)
{
    super(5,10);
    side=s;
   
}

void  Sarea()
{
    System.out.println("Area of Square="+(side*side));
    
}
void Sperimeter()
{
    System.out.println("perimeter of square="+(4*side));
}

public static void main(String[] args) {
    Square Sobj=new Square(6);
      Sobj.area();
      Sobj.perimeter();
      Sobj.Sarea();
      Sobj.Sperimeter();

    
}
    }

    
    

