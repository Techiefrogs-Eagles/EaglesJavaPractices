package inheritance;

public class Parent extends Grandparent {
  int i=36;
 void alldisplay()
  {
    System.out.println("This is parent alldisplay");
  }
    
     void display1()
    {
     System.out.println("This is Parent");
 
    }
   Parent()
   {
     System.out.println("this isnparent constroctor");

   }

Parent(String s)

{
  super(10);
  System.out.println("This is parent parem");
}
   public static void main(String[] args) {
    Parent pobj=new Parent();
        pobj.display();
        pobj.display1();
        int sum1=Grandparent.sum(3,4);
         System.out.println(sum1);
      }
      int mul()
      {
        int a=3;
        int b=5;
          System.out.println("Multipulication");
          return a*b;
        

      }
    }
  
