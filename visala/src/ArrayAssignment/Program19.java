package src.ArrayAssignment;

import java.util.Arrays;

public class Program19 {
    public static void main(String[] args) {
        char array[] = {'a','b','c','f','a','c','g','f'};
        Arrays.sort(array);
        for (char c : array) 
        {
            System.out.print(c+" ");
        }
        System.out.println();

        char[] array1 = new char[array.length];
        int temp = 0;
        for (int i = 0; i < array.length-1; i++) 
        {
            if(array[i]!=array[i+1])
            {
                array1[temp]= array[i];
                temp++;
            }
            
        }
        array1[temp] = array[array.length-1];

        for (char c : array1) 
        {
            System.out.print(c+" ");
        }
    }
}
