package practice.CollectionsPractice;

import java.util.ArrayList;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(0);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        ArrayList<Integer> obj1 = new ArrayList<Integer>();
        System.out.println(obj1.isEmpty());
        obj1.add(10);
        obj1.add(70);
        obj1.add(80);
        obj1.add(90);

        obj1.add(4, 11);

        obj.addAll(obj1);
        for (Integer integer : obj) {
            System.out.print(integer+" ");
        }
        System.out.println();
        obj.remove(10);
        for (Integer ap : obj) {
            System.out.print(ap+" ");
        }
        System.out.println();
        obj.remove((Integer)90);
        for (Integer ap : obj) {
            System.out.print(ap+" ");
        }
        System.out.println();
        obj.retainAll(obj1);
        for (Integer integer : obj) {
            System.out.print(integer+" ");
        }

        
    }
}
