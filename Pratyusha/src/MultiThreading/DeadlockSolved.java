package MultiThreading;

public class DeadlockSolved extends Thread
{  
    public static void main(String[] args) 
    {  
        final String resource11 = "ratan jaiswal";  
        final String resource21 = "vimal jaiswal";  
        Thread t12 = new Thread() 
        {  
            public void run() 
            {
                synchronized (resource11)
                { 
                    {  
                        System.out.println("Thread 1 R1: completed");  
                    }  
                }
                synchronized (resource21) 
                {
                    try 
                    { 
                        Thread.sleep(100);
                    }   
                    catch (Exception e) 
                    {

                    }
                    
                    System.out.println("Thread 1 R2: completed");
                }  
            }
              
        };  
        Thread t22 = new Thread() 
        {  
            public void run() 
            {  
                synchronized (resource21) 
                {
                    try 
                    { 
                        Thread.sleep(100);
                    } 
                    catch (Exception e) 
                    {

                    } 
                    System.out.println("Thread 2 R2: completed again"); 
                }
                synchronized (resource11)
                { 
                    {  
                        System.out.println("Thread 2 R1: completed again");  
                    }  
                }  
            }  
        };  
        t12.start();  
        t22.start();  
    }  
    
}
