import java.util.LinkedList;

public class Program6 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");

        obj.addFirst("To Nag Sir");
        obj.addLast("By Srikar");

        for (String string : obj) {
            System.out.print(string+" ");
        }
    }
}