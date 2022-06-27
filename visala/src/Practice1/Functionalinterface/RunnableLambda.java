package src.Practice1.Functionalinterface;

/*class lambeda implements Runnable {

    public void run() {
        System.out.println("This is run method");

    }

}*/

public class RunnableLambda {
    public static void main(String[] args) {
        // Thread t = new Thread(new lambeda());
        // t.start();
        // Runnable r = () -> System.out.println("This is run method");
        Thread t = new Thread(() -> System.out.println("This is run method"));
        t.start();

    }
}
