package CollectionsPractise;

import java.util.LinkedHashSet;

public class ListedHashsetPractise 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> obj = new LinkedHashSet<>();
        obj.add("Cat");
        obj.add("Fish");
        obj.add("Dog");
        obj.add("Rat");
        obj.add("Bat");   

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

