package Practice.TreeSets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("Red");
        tree.add("Green");
        tree.add("Orange");
        tree.add("White");
        tree.add("Black");
        System.out.println(tree);
        Iterator<String> itr=tree.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
    }
}
