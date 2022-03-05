package src.Practice1.Multithread;


class sclass 
{
    synchronized void Method(int n)
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
public class ThreadSyncDemo {
    public static void main(String[] args) {
        sclass obj1 = new sclass();
        Thread obj11 = new Thread(){
            public void run(){
                obj1.Method(10);
            }
        };
        Thread obj12 = new Thread(){
            public void run(){
                obj1.Method(100);
            }
        };
        obj11.start();
        obj12.start();
    }
}