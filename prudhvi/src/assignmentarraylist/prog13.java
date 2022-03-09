package assignmentarraylist;

import java.util.ArrayList;

public class prog13 {
    public static void main(String[] args) {
        ArrayList<String> colour =new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");
        colour.set(1, "Red");

        for(String string:colour){
            System.out.println(string);
        }
    }

    
}
