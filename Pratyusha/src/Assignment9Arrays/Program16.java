package Assignment9Arrays;

import java.util.Arrays;

public class Program16 
{
    public static void main(String[] args) 
    {
        int[] array = {20,3,34,43,7};
        Arrays.sort(array);
        System.out.print("ascending order of array    ");
        for (int c : array) 
        {
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("3rd largest number = "+array[array.length-3]);                    
    }
}
