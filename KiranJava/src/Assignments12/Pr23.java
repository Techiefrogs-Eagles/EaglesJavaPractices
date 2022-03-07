package Assignments12;

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;

public class Pr23 {
    public static void main(String[] args) {
        LinkedList <String> linked_list = new LinkedList <String> ();
            linked_list.add("Red");
          linked_list.add("Green");
          linked_list.add("Black");
          linked_list.add("White");
          linked_list.add("Pink");
          ArrayList<String> list = new ArrayList<String>(linked_list);

          for (String str : list){
            System.out.println(str);
          }
    }

}
