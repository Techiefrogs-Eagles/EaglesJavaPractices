package assignmentarraylist;

import java.util.ArrayList;

public class prog19 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");
        
        colour.ensureCapacity(8);
    }
    
}
