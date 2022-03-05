package MultiThreading;

public class SyncronisedBlockDemo 
{
    public static void main(String args[])
    {    
        Syn1 objs = new Syn1();  
        Thread1 t1= new Thread1(objs);    
        Thread2 t2=new Thread2(objs);    
        t1.start();    
        t2.start();    
    }  
}  
    class Syn1
{      
    void printTable(int n)
    {    
        synchronized(this)
        {  
            for(int i=1;i<=5;i++)
            {    
                System.out.println(n*i);    
                try
                {    
                    Thread.sleep(400);    
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }    
            }    
        }    
    }   
}    
    
class Thread1 extends Thread
{    
    Syn1 t;    
      Thread1(Syn1 t)
    {    
        this.t=t;    
    }    
    public void run()  
    {    
        t.printTable(5);    
    }    
}

class Thread2 extends Thread
{    
    Syn1 t;    
      Thread2(Syn1 t)
    {    
        this.t=t;    
    }    
    public void run()
    {    
        t.printTable(100);    
    }    
}    
    

