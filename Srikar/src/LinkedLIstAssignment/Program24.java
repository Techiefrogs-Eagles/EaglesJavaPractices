
import java.util.LinkedList;

public class Program24 {
    public static void main(String[] args) {
        LinkedList<String> obj1 = new LinkedList<String>();
        obj1 .add("This");
        obj1.add("is");
        obj1.add("Assignment program");
        obj1.add("in linkedlist");
        obj1.add("concept");
        

        LinkedList<String> obj2 = new LinkedList<String>();
        obj2.add("This");
        obj2.add("is");
        obj2.add("Assignment program");
        obj2.add("in linkedlist");
        obj2.add("concept");
        
        

        System.out.println(obj1.equals(obj2));
    }
}