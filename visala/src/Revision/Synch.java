package src.Revision;

public class Synch {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Threadclass Firstperson = new Threadclass(ticket, "Firstperson");
        Thread thread = new Thread(Firstperson);
        thread.start();

        Threadclass Secondperson = new Threadclass(ticket, "Scondperson");
        Thread thread1 = new Thread(Secondperson);
        thread1.start();

    }
}

class Ticket {

    boolean book = false;

    public synchronized void booking(String name)

    {
        // synchronized (this) {
        if (book == false) {

            System.out.println(name + "Select seat");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(name + "Select payment");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println(name + "Conform seat");
            book = true;
        } else {
            System.out.println("Sorry " + name + "  ticket already booked");
        }
        // }
    }
}

class Threadclass extends Thread {
    Ticket T;
    String name;

    Threadclass(Ticket ticket, String s) {
        T = ticket;
        name = s;
    }

    public void run() {
        T.booking(name);
    }
}
