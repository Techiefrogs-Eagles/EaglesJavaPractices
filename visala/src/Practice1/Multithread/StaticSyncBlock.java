package src.Practice1.Multithread;

public class StaticSyncBlock {
   
    public static void main(String[] args) 
    {
        Thread obj11 = new Thread()
        {
            public void run()
            {
                one11.two1(1);
            }
        };
        Thread obj12 = new Thread()
        {
            public void run()
            {
                one11.two1(10);
            }
        };
        Thread obj13 = new Thread()
        {
            public void run()
            {
                one11.two1(100);
            }
        };
        Thread obj14 = new Thread()
        {
            public void run()
            {
                one11.two1(1000);
            }
        };
        obj11.start();
        obj12.start();
        obj13.start();
        obj14.start();
    }
}
    

class one11 
{
    synchronized static void two1(int n)
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
