import java.util.LinkedList;

public class Program3 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.addLast("concept");


        int start = 3;//Starting at the specified position....
        for (int i = start; i < obj.size(); i++) {
            System.out.print(obj.get(i)+" ");
        }
    }
}