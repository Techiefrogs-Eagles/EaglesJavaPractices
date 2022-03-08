import java.util.LinkedList;
public class Program17 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");

        LinkedList<String> obj2 = new LinkedList<String>();
        obj2.add("S");
        obj2.add("R");
        obj2.add("I");
        obj2.add("K");
        obj2.add("A");
        obj2.add("R");

        obj.addAll(obj2);

        for (String string : obj) 
        {
            System.out.println(string);
        }
    }
}

      