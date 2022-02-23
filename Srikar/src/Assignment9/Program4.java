package Assignment9;

import java.util.Arrays;

public class Program4 
{
    public static void main(String[] args) 
    {
        char array[] = {'S','S','R','r','I','i','K','k','A','a','R','r'};
        Arrays.sort(array);
        for (char c : array) 
        {
            System.out.print(c+" ");
        }
        System.out.println();

        char[] array1 = new char[array.length];
        int temp = 0;
        for (int i = 0; i < array.length-5; i++) 
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