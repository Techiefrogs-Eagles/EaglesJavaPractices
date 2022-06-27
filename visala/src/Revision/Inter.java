package src.Revision;

public class Inter {
    public static void main(String[] args) {
        Mythread obj = new Mythread();
        obj.start();
        synchronized (obj) {
            try {
                obj.wait();
            } catch (Exception e) {

            }
            System.out.println(obj.total);
        }

    }
}

class Mythread extends Thread {

    int total = 0;

    public void run() {
        synchronized (this) {

            for (int i = 0; i <= 10; i++)
                total = total + i;
            this.notifyAll();
        }

    }
}