package practice.Miscellaneous;

import java.util.Scanner;

public class ArrayDemo 
{
    public static void main(String[] args) 
    {
        int array[]; // decleration
        //array = { 1,0,100,0,0};

        array = new int[5]; // length
        array[0] = 1;
        array[1] = 10;
        array[2] = 100;
        array[3] = 1000;
        array[4] = 10000;
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int j = array.length-1; j >= 0; j--) 
        {
            System.out.print(array[j]+" ");
        }
        System.out.println();

        char array1[] = new char[]{'a','b','c'};
        for (int i = 0; i < array1.length; i++) 
        {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for (int j = array1.length-1; j >= 0; j--) 
        {
            System.out.print(array1[j]+" ");
        }
        System.out.println();

        char array2[] = new char[5];
        array2[0] = 'A';
        array2[1] = 'B';
        array2[2] = 'C';

        for (int i = 0; i < array2.length; i++) 
        {
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        for (int j = array2.length-1; j >= 0; j--) 
        {
            System.out.print(array2[j]+" ");
        }
        System.out.println();

        String array3[] = {"hai", "hello", "hey"}; 
        for (int i = 0; i < array3.length; i++) 
        {
            System.out.print(array3[i]+" ");
        }
        System.out.println();
        for (int j = array3.length-1; j >= 0; j--) 
        {
            System.out.print(array3[j]+" ");
        }
        System.out.println();

        int array4[] = {1,2,3,4,5,6,7,8,9}; 
        for (int i : array4) 
        {
            System.out.print(i+" ");
        }
        System.out.println();

        int array5[];
        Scanner scan = new Scanner(System.in);
        System.out.println("Set length");
        int l = scan.nextInt();
        array5 = new int[l];
        for (int i = 0; i < array5.length; i++) 
        {
            array5[i] = scan.nextInt();
        }

        for (int j = array5.length-1; j >= 0; j--) 
        {
            System.out.print(array5[j]+" ");
        }
        System.out.println();

        

        boolean array6[] = new boolean[3];
        for (int i = 0; i < array6.length; i++) 
        {
            array6[i] = scan.nextBoolean();
        }

        for (int j = array6.length-1; j >= 0; j--) 
        {
            System.out.print(array6[j]+" ");
        }
        System.out.println();
        scan.close();
    }

}
