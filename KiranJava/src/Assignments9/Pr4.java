package Assignments9;

import java.util.Arrays;

public class Pr4 {
    public static void main(String[] args) 
    {
        char array[] = {'a','B','c','f','k','Z','Z','B','C','Z','k'};
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
            if(array[i]==array[i+1])
            {
                array1[temp]= array[i];
                temp++;
            }
        }

        for (char c : array1) 
        {
            System.out.print(c+" ");
        }

    }
}
