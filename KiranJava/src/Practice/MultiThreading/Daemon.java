package Practice.MultiThreading;

public class Daemon extends Thread{
    public static void main(String[] args) {
        Daemon d=new Daemon();
        Daemon d1=new Daemon();
        Daemon d2=new Daemon();
        d1.start();
        d.setDaemon(true);
        d2.start();
        d.start();

    }
    public void run(){  
        if(Thread.currentThread().isDaemon()){//checking for daemon thread  
         System.out.println("daemon thread work"); 
         System.out.println(getName()); 
        }  
        else{  
        System.out.println("user thread work"); 
        System.out.println(getName()); 
       }  
       }  
    
}
