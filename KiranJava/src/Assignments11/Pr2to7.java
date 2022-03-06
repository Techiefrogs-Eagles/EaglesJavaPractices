package Assignments11;

import java.util.ArrayList;
import java.util.Iterator;

public class Pr2to7 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("orange");
        Iterator<String> itr=colors.iterator();
        while(itr.hasNext()){
            String i=itr.next();
            System.out.println(i);
        }
    colors.add(1, "saffron");
    System.out.println("element at index2 "+ colors.get(2));
    colors.set(2, "white");
    System.out.println("updated element at index2 "+ colors.get(2));
    colors.remove(3);
    System.out.println(colors.contains("white"));
}
}
