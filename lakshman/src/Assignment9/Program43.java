package Assignment9;

import java.util.Scanner;

public class Program43 
{
    public static void main(String[] args) 
    {
        char a[] = {'G','o','o','d'};
        Scanner scan = new Scanner(System.in);
        char z = scan.next().charAt(0);
        char temp = ' ';
        for (int i = 0; i < a.length; i++) 
        {
            if(a[i] == z)
            {
                System.out.println("Array contains the given value");
                temp = a[i];
                break;
            }
        }
        if(z!=temp)
        {
            System.out.println("Array doesn't contain the given value");
        }
        scan.close();
    }
}
