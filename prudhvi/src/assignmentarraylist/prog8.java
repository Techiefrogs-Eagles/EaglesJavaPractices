package assignmentarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class prog8 {
    public static void main(String[] args) {
        ArrayList<String> colour =new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");
        Collections.sort(colour);
        for(String string:colour){
            System.out.println(string);
        }
    }
    
}
