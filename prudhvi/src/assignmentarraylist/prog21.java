package assignmentarraylist;

import java.util.ArrayList;

public class prog21 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");

        ArrayList<String> colour1=new ArrayList<String>();
        colour1.add("Yellow");
        colour1.add("White");
        colour1.add("Blue");
        colour1.add("Green");
        
        colour.addAll(colour1);
        for(String string:colour){
            System.out.println(string);
        }
    }
    
}
