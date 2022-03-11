package CollectionsPractise;

import java.util.HashSet;

public class HashSetPractise 
{
    public static void main(String[] args)
     {
        HashSet<String> obj = new HashSet<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Welcome");
        obj.add("All");
        obj.add("to the class");   

        //obj.add("F");
        //obj.clear();
        //HashSet<String> obj1 = new HashSet<>(obj);
        //System.out.println(obj.contains("E"));
        //System.out.println(obj.isEmpty());
        /*Iterator<String> itr = obj.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }*/
        //obj.remove("E");
        //System.out.println(obj.size());
        /*Spliterator<String> spitr = obj.spliterator();
        spitr.forEachRemaining(i->System.out.print(i+" "));*/

        System.out.println(obj); 
    }
 }

