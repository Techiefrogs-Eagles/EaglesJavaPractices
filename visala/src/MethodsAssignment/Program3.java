package src.MethodsAssignment;

public class Program3 {
    
}
class Areaofrectangle
{
    int length;
    int breadth;
    int side;
    void Parameter(int l,int b)
    {
        length=l;
        breadth=b;
        int A=l*b;

        System.out.println("Area of rectangle ="+A);
    }
    void Parameter(int s)
    {
        side=s;
    int S=s*s;
    System.out.println("Area of Square= "+S);
    }
    public static void main(String[] args) {
        Areaofrectangle Aobj=new Areaofrectangle();
        Aobj.Parameter(10, 20);
        Aobj.Parameter(30);
    }

    
    }
