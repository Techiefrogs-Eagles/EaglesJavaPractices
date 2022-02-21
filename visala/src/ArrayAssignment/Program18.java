package src.ArrayAssignment;

import java.util.Arrays;

public class Program18 {
    
    public static void main(String[] args) {
        int[] array = {15,29,63,8,3};
        Arrays.sort(array);
        System.out.print("ascending order of array    ");
        for (int c : array) 
        {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("2nd smallest number  "+array[1]);
    }
    
}
    

