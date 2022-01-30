public class Parent extends Grandparent {
    
     void display1()
    {
     System.out.println("This is Parent");
 
    }
    
  public static void main(String[] args) {
    Parent pobj=new Parent();
        pobj.display();
        pobj.display1();
        int sum1=pobj.sum(3,4);
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
  
