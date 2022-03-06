package Assignments11;

import java.util.ArrayList;

public class Pr18to22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrli=new ArrayList<>();
        arrli.add(43);
        arrli.add(56);
        arrli.add(123);
        arrli.add(12);
        arrli.add(1);
        arrli.ensureCapacity(25);
        System.out.println(arrli.size());
        arrli.trimToSize();
        System.out.println(arrli.size());
        ArrayList<Integer> arrli2=(ArrayList<Integer>)arrli.clone();
        System.out.println(arrli2);
        arrli2.addAll(arrli);
        System.out.println(arrli2);
    }
}
