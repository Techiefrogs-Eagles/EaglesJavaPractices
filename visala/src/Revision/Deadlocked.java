package src.Revision;

public class Deadlocked {
    public static void main(String[] args) {
        final String A1 = "Tarak";
        final String A2 = "Mokshitha";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (A1) {
                    System.out.println("Thread1: A1");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    synchronized (A2) {
                        System.out.println("Thread1: A2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (A2) {
                    System.out.println("Thread1: A2");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    synchronized (A1) {
                        System.out.println("Thread1: A1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}