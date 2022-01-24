public class constructor {
    int i=1;
        String name="Tarak";
    
 
        constructor ()
      {
        System.out.println("This is  constructor");
        
      }
    constructor(int k,String s)
    {
      System.out.println("this is parm constuctor");
   i=k;
   name=s;
    }
          public static void main(String[] args)
        {
          constructor obj=new constructor();
                obj.i=2;
                obj.name ="mokshitha";
          System.out.println(obj.i+"  "+obj.name);
          
          constructor obj1=new constructor();
          obj1.i=3;
          obj1.name ="lakshmi";
  System.out.println(obj1.i+"  "+obj1.name);
int k=5;
String s= "siva";
  constructor obj2=new constructor(4,"siva");
  System.out.println(obj2.i+" "+obj2.name);

  constructor obj3=new constructor(k,s);
  
  System.out.println(obj3.i+ " "+obj3.name);
      }
      }