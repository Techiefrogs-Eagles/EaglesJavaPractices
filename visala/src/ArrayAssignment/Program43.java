package src.ArrayAssignment;

import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
      int[] a={1,2,3,4,5};
     Scanner scan=new Scanner(System.in);
        int b =scan.nextInt();
       for (int i = 0; i < a.length; i++) {
           if(a[i]==b)
           {
               System.out.println("Array conitain a given value");
              break;

           }
           else if(a[i]!=b)
           {
            System.out.println("Array conitain not a given value");
         
           }
        
       }


    }
    
}
