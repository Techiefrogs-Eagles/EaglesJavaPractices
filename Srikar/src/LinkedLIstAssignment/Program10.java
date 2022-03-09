import java.util.LinkedList;

public class Program10 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");

        LinkedList<String> obj1 = new LinkedList<>();
        obj1.add(obj.peekFirst());
        obj1.add(obj.peekLast());

        for (String string : obj1) {
            System.out.print(string+" ");
        }
    }
}