package Assignment3;

public class Triangle 
{
    int side1;
    int base;
    int side2;
    Triangle(int p,int q,int r)
    {
        side1 = p;
        base = q;
        side2 = r;
    }
    public static void main(String[] args) 
    {
        double area;
        int temp;
        int s;
        Triangle AreaOfTriangle = new Triangle(3,4,5);
        s = (AreaOfTriangle.side1+AreaOfTriangle.base+AreaOfTriangle.side2)/2;
        temp = (s*(s-AreaOfTriangle.side1)*(s-AreaOfTriangle.base)*(s-AreaOfTriangle.side2));
        area = Math.sqrt(temp);
        System.out.println("The Area of the given triangle =   "+area);

        Triangle PerimeterOfTriangle = new Triangle(3,4,5);
        int perimeter = PerimeterOfTriangle.side1+PerimeterOfTriangle.base+PerimeterOfTriangle.side2;
        System.out.println("The perimeter of the given triangle =   "+perimeter);
    }
}
