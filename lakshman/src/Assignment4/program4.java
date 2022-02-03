package Assignment4;

class program4 
{
    
}

class rectangle
{
    int length;
    int breadth;

    rectangle(int l,int b)
    {
        length = l;
        breadth = b;
    }

    void area()
    {
        System.out.println("Area of rectangle = "+length*breadth);
    }

    void perimeter()
    {
        System.out.println("Preimeter of rectangle = "+((2*length)+(2*breadth)));
    }
}

class square extends rectangle
{
    int side;
    square(int s)
    {
        super(10 , 20);
        side = s;
    }

    void squareArea()
    {
        System.out.println("Area of square = "+(side*side));
    }

    void squarePerimeter()
    {
        System.out.println("perimeter of square = "+(4*side));
    }

    public static void main(String[] args) 
    {
        square sqobj = new square(5);
        sqobj.area();
        sqobj.perimeter();
        sqobj.squareArea();
        sqobj.squarePerimeter();
    }
}
