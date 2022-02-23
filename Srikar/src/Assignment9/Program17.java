package Assignment9;

import java.util.Arrays;

public class Program17 {
    public static void main(String[] args){
        //finding 2nd largest number in an arrays
        int[] array = {78,89,94,45,56,61,12,23};
        Arrays.sort(array);
        for (int c : array) 
        {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("2nd largest number = "+array[array.length-2]);                    
    }
}