
import java.util.LinkedList;

public class Program5 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.addLast("concept");
        obj.add(2,"JAVA");
//Specified position in the linked list........
        for (String string : obj) {
            System.out.print(string+" ");
        }
    }
}