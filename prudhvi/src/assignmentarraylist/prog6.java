package assignmentarraylist;

import java.util.ArrayList;

public class prog6 {
  public static void main(String[] args) {
      ArrayList<String> colour =new ArrayList<String>();
        colour.add("Yellow");
        colour.add("White");
        colour.add("Blue");
        colour.add("Green");

        colour.remove(3);
        for(String string:colour){
            System.out.println(string);
        }
  }  
}
