package src.Revision;

public class StaticSynch {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                logic.number(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                logic.number(10);
            }
        };
        t1.start();
        t2.start();

    }
}

class logic {
    synchronized static void number(int n) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
