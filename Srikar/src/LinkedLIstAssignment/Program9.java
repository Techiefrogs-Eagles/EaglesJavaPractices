import java.util.LinkedList;

public class Program9 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
       
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        obj.add("in linkedlist");
        obj.add("concept");
        obj.add(2,"My");  //Adding some elements by taking through reference index.......
        obj.add(3,"java"); //Adding some elements by taking through reference index.....

        for (String string : obj) {
            System.out.print(string+" ");
        }
    }
}