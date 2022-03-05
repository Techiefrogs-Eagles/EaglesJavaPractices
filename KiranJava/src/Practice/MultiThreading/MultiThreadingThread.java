package Practice.MultiThreading;

public class MultiThreadingThread extends Thread{
    public static void main(String[] args) {
        MultiThreadingThread mt=new MultiThreadingThread();
        mt.start();
        System.out.println(mt.getState());
        MultiThreadingThread mt1=new MultiThreadingThread();
        mt1.start();
        //mt.yield();
        try {
            //mt1.sleep(3000);
            mt1.suspend();
            System.out.println(mt1.getState());
            mt1.resume();
            System.out.println(mt1.getState());
            mt1.setDaemon(true);
            
            
            mt.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.interrupted());
        System.out.println(mt1.getState());



    }
    public void run(){
        System.out.println("in run method");
    }
}

