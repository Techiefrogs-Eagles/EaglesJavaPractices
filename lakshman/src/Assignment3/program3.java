package Assignment3;

public class program3 
{
    int side1;
    int base;
    int side2;
    program3()
    {
        side1 = 3;
        base = 4;
        side2 = 5;
    }
    public static void main(String[] args) 
    {
        double area;
        int temp;
        int s;
        program3 AreaOfTriangle = new program3();
        s = (AreaOfTriangle.side1+AreaOfTriangle.base+AreaOfTriangle.side2)/2;
        temp = (s*(s-AreaOfTriangle.side1)*(s-AreaOfTriangle.base)*(s-AreaOfTriangle.side2));
        area = Math.sqrt(temp);
        System.out.println("The Area of the given triangle =   "+area);

        program3 PerimeterOfTriangle = new program3();
        int perimeter = PerimeterOfTriangle.side1+PerimeterOfTriangle.base+PerimeterOfTriangle.side2;
        System.out.println("The perimeter of the given triangle =   "+perimeter);


    }
}
