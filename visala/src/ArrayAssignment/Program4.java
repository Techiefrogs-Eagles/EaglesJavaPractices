package src.ArrayAssignment;

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args)
     {
        String sarr1[]={"B","C","D","E","a","B","c","b","e","E","C"};
        Arrays.sort(sarr1);
        for (String s : sarr1) {
            System.out.print(s+" ");
        }
        System.out.println();

        String[] sarr2=new String[sarr1.length];
        int temp=0;
        for(int i=0;i<sarr1.length-1;i++)
        {
         if(sarr1[i]==sarr1[i+1])
         {
             sarr2[temp]=sarr1[i];
             temp++;
         }
        }
        for (String s : sarr2) {
            System.out.print(s+" ");
        }
     }

    
}
