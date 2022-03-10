package Assignment15;

import java.util.TreeSet;

public class Program8 {
    public static void main(String[] args) {
        TreeSet<String> obj = new TreeSet<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");
        obj.add("E");   

        TreeSet<String> obj1 = new TreeSet<>();
        obj1.add("A");
        obj1.add("B");
        obj1.add("C");
        obj1.add("D");
        obj1.add("E");

        obj.retainAll(obj1);
        
        if (obj.isEmpty()) {
            System.out.println("The given TREESETS are not equal");
        } 
        else 
        {
            System.out.println("The given TREESETS are equal");
        }     
    }
}
