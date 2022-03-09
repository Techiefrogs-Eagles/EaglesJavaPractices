package assignmentarraylist;

import java.util.ArrayList;

public class prog16 {
    public static void main(String[] args) {
        ArrayList<String> colour =new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");

        ArrayList<String> colour1 =new ArrayList<String>();
        colour1.addAll(colour);

        for(String string:colour1){
            System.out.println(string);
        }
    }
    
}
