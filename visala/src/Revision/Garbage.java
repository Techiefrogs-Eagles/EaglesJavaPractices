package src.Revision;

public class Garbage {
    public void finalize() {
        System.out.println("This is finalize method");
    }

    public static void main(String[] args) {

        {
            // Garbage g1 = new Garbage();
            new Garbage();
            // g1 = null;
            System.gc();

        }
    }
}
