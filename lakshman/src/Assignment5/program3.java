package Assignment5;

public class program3 
{
    int length;
    int breadth;
    int side;

    void parameters(int l,int b)
    {
        length = l;
        breadth = b;
        System.out.println("Area of the rectangle = "+(l*b));
    }

    void parameters(int s)
    {
        side = s;
        System.out.println("Area of the square = "+(s*s));
    }

    public static void main(String[] args) {
        program3 areaobj = new program3();
        areaobj.parameters(50, 50);
        areaobj.parameters(100);
    }
}
