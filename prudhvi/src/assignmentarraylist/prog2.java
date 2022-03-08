package assignmentarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class prog2 {
    public static void main(String[] args) {
        ArrayList<String> colour =new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");
        Iterator<String> itr = colour.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
