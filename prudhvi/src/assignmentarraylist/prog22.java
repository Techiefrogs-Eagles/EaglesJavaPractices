package assignmentarraylist;

import java.util.ArrayList;

public class prog22 {
    public static void main(String[] args) {
        ArrayList<String> colour=new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");
        
        for(int i=0;i<colour.size();i++){
            System.out.println(colour.get(i));
        }
    }
    
}
