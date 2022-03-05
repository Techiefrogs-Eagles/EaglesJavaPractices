package MultiThreading;

public class ThreadSyncronisationDemo 
{
    public static void main(String[] args) {
        one1 obj1 = new one1();
        Thread obj11 = new Thread(){
            public void run(){
                obj1.two1(10);
            }
        };
        Thread obj12 = new Thread(){
            public void run(){
                obj1.two1(100);
            }
        };
        obj11.start();
        obj12.start();
    }
}

class one1 
{
    synchronized void two1(int n)
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(n*i);
        }
        try 
        {
            Thread.sleep(1000);
        } 
        catch (Exception e) 
        {
            System.out.println("exception handled");
        }
    }
}

    
