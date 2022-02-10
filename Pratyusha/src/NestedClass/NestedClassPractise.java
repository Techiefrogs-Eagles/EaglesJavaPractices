package NestedClass;


public class NestedClassPractise 
{
    int a = 10;
    String Name = "Divya";
            
    void Display11()
     {
        System.out.println("This is the First Method");
     }
     class NestedClassPractise1
     {
         byte b = 100;

         void Display22()
         {
             System.out.println("This is the Second Method");
         }
         static class NestedClassPractise2
         {
             boolean b = true;
             static boolean c = false;

             static void Display33()
             {
                 System.out.println("This is the Third Method in static");
             }
             void Display44()
             {
                 System.out.println("This is the  Fourth Normal Method ");
             }

         }

     }
         private class A1
         {
             void D1()
             {
                 System.out.println("This is Access Modifier class in private");
             }
             abstract class  AbstractB1 
             {
                private int g = 200;
                 private static int h = 300;
                
                 void B2()
                {
                    System.out.println("This is Abstract class");
                }
                abstract void B3();
                static void B4()
                {
                    System.out.println("This is static Method");
                }
                 
             }
         }
         protected class A2
         {
             void D2()
             {
                 System.out.println("This is Access Modifier class in protected");

             }
             interface E1
             {
                 int k = 50;
                 default void F1()
                 {
                     System.out.println("This is Interface class");
                 }
                 static void F2()
                 {
                     System.out.println("This is Interface  static class");
                 }
                 void F3();
             }

        }
         
         public class A3
         {
             void D3()
             {
                 System.out.println("This is Access Modifier class in Public");
             }

         }
     

public static void main(String[] args) {
    NestedClassPractise nestobj1 = new NestedClassPractise();
    System.out.println(nestobj1.a);
    System.out.println(nestobj1.Name);
    nestobj1.Display11();
    NestedClassPractise.NestedClassPractise1 nestobj2 = nestobj1.new NestedClassPractise1();
    System.out.println(nestobj2.b);
    nestobj2.Display22();
    NestedClassPractise.NestedClassPractise1.NestedClassPractise2 nestobj4 = new NestedClassPractise.NestedClassPractise1.NestedClassPractise2();
    System.out.println(NestedClassPractise.NestedClassPractise1.NestedClassPractise2.c);
    nestobj4.Display44();
    NestedClassPractise.NestedClassPractise1.NestedClassPractise2.Display33();
    NestedClassPractise.A1 nestobj5 = nestobj1.new A1();
    nestobj5.D1();
    NestedClassPractise.A2 nestobj6 = nestobj1.new A2();
    nestobj6.D2();
    NestedClassPractise.A3 nestobj7 = nestobj1.new A3();
    nestobj7.D3();
    NestedClassPractise.A1.AbstractB1 abtobj8 = nestobj5.new AbstractB1()
    {

        
        void B3() {
           System.out.println("This is a Abstract Class");
            
        }
        

    };
         System.out.println(abtobj8.g+" "+NestedClassPractise.A1.AbstractB1.h);
          abtobj8.B2();
          abtobj8.B3();
          NestedClassPractise.A1.AbstractB1.B4();

          NestedClassPractise.A2.E1 nestobj8 = new NestedClassPractise.A2.E1()
          {

            
            public void F3() {
                System.out.println("This is Interface class in protected");
                
            }

          };
          System.out.println(NestedClassPractise.A2.E1.k);
          nestobj8.F1();
          nestobj8.F3();
          NestedClassPractise.A2.E1.F2();










}

}
