package practice.Threads;
class one 
{
    void method(int n)
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

class three extends Thread
{
    one obj;
    three(one obj1)
    {
        obj = obj1;
    }
    public void run()
    {
        obj.method(3);
    }
}

class four extends Thread
{
    one obj;
    four(one obj1)
    {
        obj = obj1;
    }
    public void run()
    {
        obj.method(100);
    }
}

public class ThreadNonSync 
{
    public static void main(String[] args) 
    {
        one tobj = new one();
        three thobj = new three(tobj);
        four thobj1 = new four(tobj);
        thobj.start();
        thobj1.start();
    }
}