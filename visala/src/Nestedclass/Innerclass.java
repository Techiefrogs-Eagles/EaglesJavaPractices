package src.Nestedclass;

public class Innerclass 
{
    
    int a=10;
    String n="Java";
    void display()
    {
        System.out.println("THis is display method");

    }
    static void display1()
    {
System.out.println("This is static method");

    }
    Innerclass()
    {
        System.out.println("This is constructor");

    }
    class Innerclass1
    {
        boolean b=true;
        double d=100.0;
       private  void display2()
        {
           System.out.println("This is Private method");
           Innerclass Inobj=new Innerclass();
           Innerclass1 Inobj1=new Innerclass1();
           Innerclass2 Inobj2=new Innerclass2();
        }
       private Innerclass1()
        {
            System.out.println("This is Innerclass1 Constructor");

        }
        class Innerclass2
        {
            Float f=1.43f;
            Byte b1=4;
            protected void display3()
            {
                System.out.println("This is display3");
                
    }
}

    }
class Innerclass3
{
    void Display4()
    {
        System.out.println("This is Display4 method");

    }
    Innerclass3()
    {
        System.out.println("This is Innerclass3 constructor");

    }
    abstract class Innerclass4
    {
        abstract void display5();
        void display6()
        {
            System.out.println("This is normal method in abstract class");
        }
      
    }
  class Innerclass5 extends Innerclass4

    {

        
        
        void display5() {
            System.out.println("This is Abstract class");

            
        }
        
    }
    
}
    public static void main(String[] args) {
        Innerclass Inobj=new Innerclass();
        Innerclass1 Inobj1=Inobj.new Innerclass1();
      Innerclass.Innerclass1.Innerclass2 Inobj2=Inobj1.new Innerclass2();
      Innerclass3 Inobj3=Inobj.new Innerclass3();
      Innerclass3.Innerclass4 Inobj4=Inobj3.new Innerclass4() {

        void display5() {
            System.out.println("This is abstract method");

        }
          
      };
      Innerclass.Innerclass3.Innerclass5 Inobj5=Inobj3.new Innerclass5();
 
      System.out.println(Inobj.a);
      System.out.println(Inobj.n);
      Inobj.display();
      Innerclass.display1();
      System.out.println(Inobj1.b);
      System.out.println(Inobj1.d);
      Inobj1.display2();
      System.out.println(Inobj2.f);
      System.out.println(Inobj2.b1);
      Inobj2.display3();
      Inobj3.Display4();
      Inobj4.display5();
      Inobj5.display5();
      Inobj4.display6();
    }
   
}


