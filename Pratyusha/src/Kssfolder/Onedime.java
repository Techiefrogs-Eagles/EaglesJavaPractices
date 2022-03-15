package Kssfolder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Onedime 
{
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        System.out.println("Enter your number:");
        for(int i = 0;i<n;i++)
        { 
            num[i]= Integer.parseInt(br.readLine());
        }
        
        int limit = n-1;
        boolean flag = false;
        int temp;
        for(int i = 0;i<limit;i++)
        {
            for(int j = 0;j<limit;j++)
            {
               // if thed 1st bigger than the second one swap
               if(num[j]>num[j+1])
               {
                   temp = num[j];
                   num[j] = num[j+1];
                   num[j+1] = temp;
                   flag = true;
               }
            }
            if(flag == false)
             break;
             else 
             flag = false;
        }
        System.out.println("Sorted array in ascending order:");
        for(int i = 0;i<n;i++)
        {
            System.out.println(num[i]);
        }





        
    }
}
