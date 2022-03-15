package Kssfolder;

import java.util.Scanner;

public class ArrayScanner 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        System.out.println("Enter"+num.length+"interger values:");
        for(int i = 0;i<num.length;i++)
        {
            num[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<num.length;i++)
        {
            sum+= num[i];
        }
        System.out.println("Sum:"+" "+sum);
        sc.close();
    }
}
