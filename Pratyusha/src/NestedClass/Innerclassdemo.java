package NestedClass;

public class Innerclassdemo {
    int i = 30;
    String name = "Smiley";
    void display(){
        System.out.println("Display Innerclass");
    }
  static void display1(){
      System.out.println("Display static method");
  }
   Innerclassdemo(){
       System.out.println("This is a constuctor");
   }

   class Innerclassdemo1{
       boolean b = true;
       double d = 52.35;
       private void display2(){
           System.out.println("Display private method");

       }
       private Innerclassdemo1(){
            System.out.println("This is a private constructor ");
        }

    class Innerclassdemo2{
        byte y = 5;
        float f = 1.25f;

        protected void display3() {
            System.out.println("Display protected method");
            Innerclassdemo2 inobj2 = new Innerclassdemo2();  
        }
    
    
    }
}


    
       

    class Outerclass1{
        void basicmethod(){
            System.out.println("Display basic method");
        }

        Outerclass1(){
            System.out.println("This is my outerclass Constructor");
        }

    abstract class Outerclass2 {
        abstract void display5();

    }
    class Outerclass3 extends Outerclass2 {

    
        void display5() {
          System.out.println("This is my abstact class");
            
        }
        
    }
        }
    

public static void main(String[] args) {

    Innerclassdemo inobj = new Innerclassdemo();
    Innerclassdemo1 inobj1 = inobj.new Innerclassdemo1();
    Innerclassdemo.Innerclassdemo1.Innerclassdemo2 inobj2 = inobj1.new Innerclassdemo2();
    Outerclass1 outobj = inobj.new Outerclass1();
    Outerclass1.Outerclass2 outobj2 = outobj.new Outerclass2() {

        
        void display5() {
            System.out.println("This is the Abstract method");
            
        }
    
    };

    System.out.println(inobj.i);
    System.out.println(inobj.name);
      inobj.display();
      Innerclassdemo.display1();
    System.out.println(inobj1.b);
    System.out.println(inobj1.d);
    inobj1.display2();
    System.out.println(inobj2.y);
    System.out.println(inobj2.f);
    inobj2.display3();
    outobj.basicmethod();
    outobj2.display5();


    
    




    
           
       }
}


   

    

