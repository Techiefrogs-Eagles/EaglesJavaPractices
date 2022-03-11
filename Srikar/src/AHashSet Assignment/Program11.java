


import java.util.HashSet;

public class Program11 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("chair");
        hashSet.add("table");
        hashSet.add("Laptop");
        hashSet.add("Charger");
        

        HashSet<String> obj=new HashSet<>();
        obj.add("This");
        obj.add("is");
        obj.add("table");
        obj.add("Assignment program");
        obj.add("Charger");
        

         hashSet.retainAll(obj);
         System.out.println(obj);
    }

}


