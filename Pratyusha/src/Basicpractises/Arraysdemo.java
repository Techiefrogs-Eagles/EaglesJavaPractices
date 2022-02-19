package Basicpractises;

import java.util.Scanner;

public class Arraysdemo 
{
   public static void main(String[] args) 
   {
       
      int array[];  //declaration of a variable

       array  = new int[5]; // length of the variable
       array[0] = 1;
       array[1] = 5;
       array[2] = 10;
       array[3] = 15;
       array[4] = 20;

       for(int i = 0; i < array.length; i++)
       {
           System.out.print(array[i]+" ");
       }
       System.out.println();

       for(int j = array.length-1; j>=0;j--)
       {
           System.out.print(array[j]+" ");
       }
       System.out.println();


       char array1[] = new char[]{'a','b','c'};

       for( int i = array1.length-1; i >= 0; i--)
       {
           System.out.print(array1[i]+ " ");
       }
        
       System.out.println();

       char array2[] = new char[]{'A','B','C'};

       for(int i = 0; i < array2.length; i++)
       {
           System.out.print(array2[i]+" ");
       }

       System.out.println();

       for(int j = array2.length-1; j >= 0; j--)
       {
           System.out.print(array2[j]+" ");
       }
       System.out.println();

       String array3[] = {"Dog", "Cat","Rat"};

       for(int i = 0; i < array3.length; i++)
       {
          System.out.print(array3[i]+" ");
       }
       System.out.println();

       for(int j = array3.length-1; j >=0 ; j--)
       {
           System.out.print(array3[j]+ " ");
       }

       int array4[] = new int[5];

       Scanner scan = new Scanner(System.in);

       for(int i = 0 ; i < array4.length ; i++)
       {
            array4[i] = scan.nextInt();

       }
       for(int i = 0 ; i < array4.length ; i++) 
       {
        System.out.print(array4[i]+" ");
       }

       scan.close();
         
       System.out.println();

       for(int i = array4.length-1; i >= 0 ; i--)
       {
            System.out.print(array4[i]+" ");

       }

         boolean array6[] = new boolean[3];

       for ( int i = 0 ; i < array6.length; i++)
       {
           array6[i] = scan.nextBoolean();
       }

       for (int j = array6.length-1; j >=0; j--)
       {
          System.out.println(array6[j]+" ");
       }
         System.out.println();

         scan.close();
         
         int array7[] = {1,2,3,4,5,6};
         for(int i : array7)
         {
             System.out.print(i+" ");
         }
     }
}
