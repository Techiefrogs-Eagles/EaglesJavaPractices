package src.Nestedclass.P1;

//import src.Nestedclass.P1.Innerclass1.Nestedclass3.Abstract1;

public class Innerclass1 {
    int i=20;
    String S="Visala";
    void InnerMethod1()
    {
        System.out.println("This is InnerMethod1");

    }

    class  Nestedclass{
        void NestedMethod1()
        {
            System.out.println("This is nestedMethod1");

        }
        static class Nestedclass1
        {
            int j=30;
            static int k=80;
            void NestedMethod2()
            {
                System.out.println("This is NestedMethod2");
                
            }
            static void StaticMethod()
            {
                System.out.println("This is static method");
            }
        }
        
       
    }
     private class Nestedclass3
    {
        void D1()
        {
            System.out.println("D1");
            
        }
        abstract class Abstract1
        {
          private int a=10;
         // static int b=20;
          private static int c=30;

          void AD()
          {
              System.out.println("This is AD");
          }
          abstract void AA();
          static void SA()
          {
              System.out.println("This is AA");
          }
        }
    }
    protected class Nestedclass4
    {
        void D2()
        {
            System.out.println("D2");

        }
        interface IC{
            int i=10;
           void IA();
           static void ISA()
           {
               System.out.println("ISA");

           }
           default void IDA()
           {
               System.out.println("IDA");
           }
           
        }
        
    }
    public class Nestedclass5
    {
        void D3()
        {
            System.out.println("D3");
        }
    }

    public static void main(String[] args) {
        Innerclass1 Iobj=new Innerclass1();
        System.out.println(Iobj.S);
        System.out.println(Iobj.i);
        Iobj.InnerMethod1();
        Innerclass1. Nestedclass Nobj=Iobj. new Nestedclass();
        Nobj.NestedMethod1();
        Innerclass1.Nestedclass . Nestedclass1 Nobj1=new Innerclass1.Nestedclass.Nestedclass1();
        System.out.println(Nobj1.j);
        System.out.println(Innerclass1.Nestedclass.Nestedclass1.k);
        Nobj1.NestedMethod2();
        Innerclass1.Nestedclass.Nestedclass1.StaticMethod();
        Innerclass1.Nestedclass3 INobj=Iobj.new Nestedclass3();
        INobj.D1();
        Innerclass1.Nestedclass4 INobj1=Iobj. new Nestedclass4();
        INobj1.D2();
        Innerclass1.Nestedclass5 INobj2=Iobj. new Nestedclass5();
        INobj2.D3();
        Innerclass1.Nestedclass3.Abstract1 INA=INobj.new Abstract1()
        {

            
            void AA() {
                System.out.println("This is AA");

            }

        };
        System.out.println(INA.a);
        System.out.println(Innerclass1.Nestedclass3.Abstract1.c);
        Innerclass1.Nestedclass3.Abstract1.SA();
        INA.AA();
        INA.AD();

        Innerclass1.Nestedclass4.IC INC=new Innerclass1.Nestedclass4.IC()
        {

            
            public void IA() {
                System.out.println("This is IA");
                
            }

        };
        INC.IDA();
        System.out.println(Innerclass1.Nestedclass4.IC.i);
        Innerclass1.Nestedclass4.IC.ISA();
        INC.IA();
    }
    
}
