import java.util.LinkedList;

public class Program20 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");
        

        System.out.println("First element   "+obj.peekFirst());

        for (String string : obj) 
        {
            System.out.println(string);
        }
    }
}