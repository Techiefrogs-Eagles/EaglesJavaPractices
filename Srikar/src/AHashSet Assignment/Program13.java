
//Conversion of Array to hash set and vice-versa

import java.util.HashSet;

public class Program13 {
    public static void main(String[] args) {
        
        String[] array={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q"};

        HashSet<String> obj=new HashSet<>();
       for (int i = 0; i < array.length; i++) {
           obj.add(array[i]);
       }
        System.out.println(obj);


        //HashSet to array
      Object[] A=obj.toArray();
       for (Object object : A) 
       {
          System.out.println(object);
        }
    }
}