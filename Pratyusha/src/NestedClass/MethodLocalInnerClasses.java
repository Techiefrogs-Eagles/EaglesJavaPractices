package NestedClass;

public class MethodLocalInnerClasses 
{
    int a = 10;
    String s = "Donkey";

    void display1()
    {
        System.out.println("This is display Method");
        
       class InnerClass1
        {
              boolean b = false;
               static void display2()
              {
                  System.out.println("This is static Method");
                class InnerClass2
                  {
                      double c = 52.23;
                      void display3()
                      {
                          System.out.println("This is display3 Method");
                      }
                  }
                  InnerClass2 Inobj2 = new InnerClass2();
                  Inobj2.display3();
                  System.out.println(Inobj2.c);
                  
                
              }
              InnerClass1()
              {
                  System.out.println("This is a constructor method");
                  abstract class Abstract1
                  {
                      abstract void Monkey();
                  }
                  Abstract1 abobj = new Abstract1() {
                     void Monkey()
                     {
                         System.out.println("Abstract Method");
                     }
                  };
                  abobj.Monkey();
              }

        }
        InnerClass1.display2();
        InnerClass1 inobj1 = new InnerClass1();
        System.out.println(inobj1.b);



    }
    public static void main(String[] args) {
        MethodLocalInnerClasses methobj = new MethodLocalInnerClasses();
        methobj.display1();
        System.out.println(methobj.a);
        System.out.println(methobj.s);
    }

}
