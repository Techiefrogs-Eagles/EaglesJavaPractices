package Practice.MultiThreading;

public class TestDeadlock {
    public static void main(String[] args) {
        final String res1="kiran kumar";
        final String res2="charan ";
        Thread t1=new Thread(){
            public void run(){
                synchronized(res1){
                    System.out.println("Thread 1: Locked res1");
                }
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    //TODO: handle exception
                }
                synchronized(res2){
                    System.out.println("Thread 1: Locked res2");
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                synchronized(res2){
                    System.out.println("Thread 2: Locked res2");
                }
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    //TODO: handle exception
                }
                synchronized(res1){
                    System.out.println("Thread 2: Locked res1");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
