package src.ArrayAssignment;

import java.util.Arrays;

public class Program17 {
    
    public static void main(String[] args) {
        int[] array = {15,29,63,8};
        Arrays.sort(array);
        System.out.print("ascending order of array    ");
        for (int c : array) 
        {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("2rd largest number = "+array[array.length-3]);
    }
    
}

