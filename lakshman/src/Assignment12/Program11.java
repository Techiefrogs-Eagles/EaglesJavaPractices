package Assignment12;

import java.util.LinkedList;

public class Program11 {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");

        for (int i = 0; i < obj.size(); i++) {
            System.out.println("index - "+i+"  "+obj.get(i));
        }
    }
}
