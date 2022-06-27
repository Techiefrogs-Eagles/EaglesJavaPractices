package src.Revision;

public class ETMultithread extends Thread {

    String name;

    ETMultithread(String s) {
        name = s;
    }

    public void run() {
        System.out.println("Run method");
        for (int i = 0; i <= 10; i++)
            System.out.println(name + i);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        System.out.println("Start main method");
        Thread t = Thread.currentThread();
        System.out.println(t);
        ThreadGroup Tg = new ThreadGroup("User group");
        ETMultithread obj = new ETMultithread("First");

        Thread t1 = new Thread(Tg, obj);
        t1.setName("First");
        t1.setPriority(1);
        System.out.println(t1);
        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
        }
        t1.setDaemon(true);
        ETMultithread obj1 = new ETMultithread("second");

        Thread t2 = new Thread(Tg, obj1);
        t2.setName("second");
        t2.setPriority(2);
        System.out.println(t2);
        t2.start();
        try {
            t2.join();

        } catch (Exception e) {
        }
        System.out.println("End thread");
        System.out.println("main thread:" + t.isDaemon());
        System.out.println("first thread:" + t1.isDaemon());
        System.out.println("second thread:" + t2.isDaemon());

    }

}
