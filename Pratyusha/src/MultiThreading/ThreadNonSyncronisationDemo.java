package MultiThreading;

public class ThreadNonSyncronisationDemo 
{
    public static void main(String[] args) 
    {
        One objo1 = new One();
        two objt2 = new two(objo1);
        Three objt3 = new Three(objo1);
        objt2.start();
        objt3.start();

    }
}
  class One
  {
      void one1(int n)
      {
          for(int i = 1;i <= 5; i++)
          {
              System.out.println(n*i);
          }
          try
          {
             Thread.sleep(2000);
          }
          catch(Exception ex)
          {
              System.out.println("Exception handled");
          }
      }
  }
  class two extends Thread
  {
     One obj;
     two(One obj1)
     {
         obj = obj1;
     }
     public void run()
     {
         obj.one1(10);
     }
      
  }
  class Three extends Thread
  {
    One obj;
    Three(One obj1)
    {
        obj = obj1;
    }
    public void run()
    {
        obj.one1(100);
    }
     

  }
