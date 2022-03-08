package Assignment12;

import java.util.LinkedList;

public class Program18 extends LinkedList<String>{
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("Hello");
        obj.add("Team");
        obj.add("Eagles");
        obj.add("Good");
        obj.add("Morning");
        if(obj instanceof LinkedList<String>){
        
        LinkedList<String> obj1 = (LinkedList<String>) obj.clone();


        for (String string : obj1) 
        {
            System.out.println(string);
        }
    }
    }
}
