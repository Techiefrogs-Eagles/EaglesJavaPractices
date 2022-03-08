package assignmentarraylist;

import java.util.ArrayList;

public class prog7 {
    public static void main(String[] args) {
        ArrayList<String> colour= new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");

        System.out.println(colour.contains("Blue"));
    }
    
}
