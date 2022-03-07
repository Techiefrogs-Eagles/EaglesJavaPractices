package Assignments12;

import java.util.LinkedList;

public class Pr24to26 {
    public static void main(String[] args) {
        LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");

        //comparison output in linked list
        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : c1)
           c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3); 
        c1.removeAll(c1);
        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());
        c2.set(1, "one");
        System.out.println(c2);
    }
}
