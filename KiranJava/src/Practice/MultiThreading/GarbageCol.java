package Practice.MultiThreading;

public class GarbageCol extends Thread {
    public static void main(String[] args) {
        GarbageCol g=new GarbageCol();
        GarbageCol g1=new GarbageCol();
        GarbageCol g2=new GarbageCol();
        g2.start();
        
        g1.start();
        g=g2;
        
        g2=null;
        System.gc();
    }
   public void run(){
        System.out.println("Thread running");
        System.out.println(getName());
    }
    public void finalize(){
        System.out.println("object is garbage collected");
    }  
}
