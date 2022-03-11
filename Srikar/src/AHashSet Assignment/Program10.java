

import java.util.HashSet;

public class Program10 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("chair");
        hashSet.add("table");
        hashSet.add("Laptop");
        hashSet.add("Charger");

        HashSet<String> obj=new HashSet<>();
        obj.add("This");
        obj.add("is");
        obj.add("Assignment program");
        

        hashSet.retainAll(obj);

        if(hashSet.isEmpty())
        {
           System.out.println("not equal");
        }
        else
        {
            System.out.println("equal");
        }

    }
}