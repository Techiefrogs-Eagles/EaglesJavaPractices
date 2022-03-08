package assignmentarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class prog17 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");
        Collections.sort(colour);

        ArrayList<String> colour1=new ArrayList<String>();
        colour1.add("Yellow");
        colour1.add("White");
        colour1.add("Blue");
        colour1.add("Green");
        Collections.sort(colour1);

        System.out.println(colour.equals(colour1));
    }
    
}
