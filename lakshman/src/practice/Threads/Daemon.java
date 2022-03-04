package practice.Threads;

public class Daemon extends Thread{
    public static void main(String[] args) {
        Daemon obj = new Daemon();
        Daemon obj1 = new Daemon();
        obj.start();
        System.out.println(Thread.currentThread().getState());
        obj.setDaemon(true); // changes from USER thread to DAEMON thread
        obj.setDaemon(false); // changes from DAEMON thread to USER thread
        if(obj.isDaemon()){   // returns boolean value by checking the thread is Daemon or not
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
        obj1.start();
    }

    public void run(){
        System.out.println("good");
    }
}
