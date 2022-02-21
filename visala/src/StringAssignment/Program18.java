package src.StringAssignment;

import java.util.Arrays;

public class Program18 {
    public static void main(String[] args) {
        String str = "Elephant";
         char array[] = str.toCharArray();
         Arrays.sort(array);
        for(char i : array)
        {
            System.out.print(i+" ");
            
        }
    }
    
}
