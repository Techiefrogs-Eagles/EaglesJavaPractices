package Assignment5;

public class degree {
    void getDegree()
    {
        System.out.println("i got a degree");
    }

    public static void main(String[] args) 
    {
        degree twoobj = new degree();
        twoobj.getDegree();
    }
}

class subclass1
{
    void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }
    
    public static void main(String[] args) 
    {
        subclass1 twoobj = new subclass1();
        twoobj.getDegree();
    }
}

class subclass2 extends degree
{
    void getDegree()
    {
        System.out.println("I am an Postgraduate");
    }

    public static void main(String[] args) 
    {
        subclass2 twoobj = new subclass2();
        twoobj.getDegree();
    }
}