package Practice.MultiThreading;

public class MultiThread implements Runnable{
    public static void main(String[] args) {
       MultiThread mu=new MultiThread(); 
       Thread tmu=new Thread(mu, "newthread");
        tmu.start();
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
}
}
class Newthre extends Thread{
    public void run(){  
        System.out.println("thread is running...");  
        }  
    public static void main(String[] args) {
        Newthre nw=new Newthre();
        nw.start();
    }
}
 class Mythread{
public static void main(String[] args) {
    Thread t=new Thread("first thread");
    t.start();
    System.out.println(t.getName());
}
public void run(){
    System.out.println("thread is running");
}
}