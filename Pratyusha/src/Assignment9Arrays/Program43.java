package Assignment9Arrays;

import java.util.Scanner;

public class Program43 
{
    public static void main(String[] args) 
    {
        int x[] = {1,2,3};
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int temp = ' ';
        for (int i = 0; i < x.length; i++) 
        {
            if(x[i] == j)
            {
                System.out.println("Array contains the given value");
                temp = x[i];
            }
        }
            if(j!=temp)
        {
               System.out.println("Array doesn't contains the given value");
        }
           sc.close();
    }
}
