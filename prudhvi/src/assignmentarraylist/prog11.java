package assignmentarraylist;

import java.util.ArrayList;

public class prog11 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");

        String temp=colour.get(2);
        colour.set(2,colour.get(3));
        colour.set(3, temp);

        for(String string:colour){
            System.out.println(string);
        }
    }
    
}
