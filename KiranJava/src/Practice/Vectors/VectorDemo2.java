package Practice.Vectors;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<Integer> in = new Vector<>();  
        //Add elements in the vector  
        in.add(100);  
        in.add(200);  
        in.add(300);  
        in.add(200);  
        in.add(400);  
        in.add(500);  
        in.add(600);  
        in.add(700); 
        Enumeration<Integer> en=in.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        
    }
}
