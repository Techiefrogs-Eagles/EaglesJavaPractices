package practice.Miscellaneous;

public class MultiThreadingDemo implements Runnable
{
   
    public static void main(String[] args) 
    {
        MultiThreadingDemo obj = new MultiThreadingDemo();
        Thread tobj = new Thread(obj, "lakshman");
        Thread tobj1 = new Thread(obj, "lakshman1");
        tobj.start();
        
        try 
        {
            tobj.join();
        } 
        catch (InterruptedException e) 
        {
            
        }
        tobj1.start();
        
        // creating a THREAD
        //System.out.println(tobj.getName());   
    }
 
    public void run()
    {
        System.out.println("run");
        for (int i = 0; i < 3; i++) 
        {
            try 
            {
                Thread.sleep(500); // time should not be negative
            }
            catch(InterruptedException e)
            {
 
            }
            System.out.println(i);
        }
        System.out.println(Thread.currentThread().getName()); 
        System.out.println(Thread.currentThread().getState());
    }
}

class Hello extends Thread
{
    public static void main(String[] args) 
    {
        Hello obj = new Hello();
        obj.start();
        Thread tobj = new Thread();
        tobj.start();
    }

    public void run()
    {
        System.out.println("run");
    }
}