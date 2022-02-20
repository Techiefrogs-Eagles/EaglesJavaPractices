package Assignments9;

import java.util.Arrays;

public class Pr18 {
    public static void main(String[] args) 
    {
        int[] array = {20,34,345,436,75};
        Arrays.sort(array);
        System.out.print("ascending order of array    ");
        for (int c : array) 
        {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("2nd smallest number = "+array[1]);                    
    }
}
