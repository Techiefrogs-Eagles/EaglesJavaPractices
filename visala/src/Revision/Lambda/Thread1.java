package src.Revision.Lambda;

public class Thread1 {
    public static void main(String[] args) {
        Thread tobj = new Thread(() -> System.out.println("This is run method"));
        tobj.start();
    }

}
