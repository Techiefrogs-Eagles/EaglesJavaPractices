package Practice.HashSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(12);
        hs.add(1);
        hs.add(22);
        hs.add(31);
       //hs.add(null);
    
        Iterator<Integer> i=hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        hs.remove(1);
       System.out.println( hs.size());
       ArrayList<Integer> arr=new ArrayList<>();
       arr.addAll(hs);
       System.out.println(hs.contains(12));
        hs.removeIf(strr->strr.equals(1));
        System.out.println(hs);
       
    }
}
