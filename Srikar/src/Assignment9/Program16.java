package Assignment9;

import java.util.Arrays;

public class Program16 {
    public static void main(String[] args){
        //finding 3rd largest number in an arrays
        int[] array = {78,89,94,45,56,61,12,23};
        Arrays.sort(array);
        for (int c : array) 
        {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("3rd largest number = "+array[array.length-3]);                    
    }
}