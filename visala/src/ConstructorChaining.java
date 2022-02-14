package src;

public class ConstructorChaining {
    
    ConstructorChaining()
    {
        //this(5);
        System.out.println("This is default Constructor");

    }
    ConstructorChaining(int a)
    {
        this(3,5);
        System.out.println(a);

    }
    ConstructorChaining(int a, int b)
    {
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        
    
    ConstructorChaining Cobj=new ConstructorChaining();

    }
}

class ConstructorChaining1 extends ConstructorChaining{

    ConstructorChaining1(int X)
    {
        super(5,6);
        System.out.println("parameter");
        
    }
    void method()
    {
        System.out.println("This is Method");
    }
    public static void main(String[] args) {
        ConstructorChaining1 Cobj1=new ConstructorChaining1(3);
        
        Cobj1.method();
    }

}