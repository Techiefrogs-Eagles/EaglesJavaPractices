package src.Practice1.Multithread;

public class ThreadnotSyncDemo {
    public static void main(String[] args) {
      
        class1 cobj=new class1();
        class2 cobj1=new class2(cobj);
        class3 cobj2=new class3(cobj);
           cobj1.run();
           cobj2.run();

    }
    
}

class  class1{
    void method(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println( n*i);
        }
        try{
            Thread.sleep(500);
        }catch(Exception e)
        {
            System.out.println("Exception handling");
        }
    }
}
class class2 extends Thread{
    
      class1 obj;
      class2(class1 obj1)
      {
         obj=obj1;
      }
    public  void run()
      {
        obj.method(10);
      }
      
    }
class class3 extends Thread{
    
        class1 obj;
        class3(class1 obj1)
        {
           obj=obj1;
        }
      public  void run()
        {
          obj.method(100);
        }
}