package src;


public class Constructors {

    int a;
    Constructors()
    {
       System.out.println("This is Constructor");
    }

    Constructors(int a)
    {
        this.a=a;
        System.out.println("This is a Parameter Constructor");
        
    }
    Constructors(int a ,String s)
    {
        this();
      System.out.println("This is Prameter1 Constructor");
    }
    public static void main(String[] args) {
       // Constructors Cobj2=new Constructors();
       // Constructors Cobj=new Constructors(2);
       // Constructors Cobj1=new Constructors( 2,"Java");

    }
    
}


class Constructors1 extends Constructors{
    Constructors1()
    {
        super(1,"aaa");
        System.out.println("This is the sub class Constructor");

    }
    public static void main(String[] args) {
       // Constructors1 Conobj=new Constructors1();
    }
}