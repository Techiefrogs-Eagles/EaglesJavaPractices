package src.CollectionAssignment.TreeSetAssignment;

import java.util.TreeSet;

public class Program8 {
    public static void main(String[] args) {
        TreeSet<String> T=new TreeSet<>();
        T.add("Ant");
        T.add("Cat");
        T.add("Dog");
        T.add("Bear");
        T.add("Elephant");
        
        TreeSet<String> T1=new TreeSet<>();
        T1.add("Fox");
        T1.add("Goat");

       if(T.equals(T1))
       {
           System.out.println("two Treeset are equal");
       }
       else{
           System.out.println("Not equal");
       }
    }
}
