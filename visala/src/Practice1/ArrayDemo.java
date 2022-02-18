package src.Practice1;
import java.util.*;

public class ArrayDemo {
    
    public static void main(String[] args) {
        int arr[] ;             //declaration of variable
        arr=new int[10];         //Instansiation
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
arr[5]=6;
arr[6]=7;
arr[7]=8;
arr[8]=9;
arr[9]=10;



        for(int i=0;i< arr.length;i++)
         {
           System.out.print(arr[i]+" ");
         }
         System.out.println();
        for(int j=arr.length-1;j>=0;j--)
         {
           System.out.print(arr[j]+" ");
         }
         System.out.println();

         
         char arr2[]=new char[5];
         arr2[0]='A';
         arr2[1]='B';
         arr2[2]='C';
         arr2[4]='E';
         arr2[3]='D';

        

         
        for(int i=0;i< arr2.length;i++)
        {
          System.out.print(arr2[i]+" ");
        }
        System.out.println();
       for(int j=arr2.length-1;j>=0;j--)
        {
          System.out.print(arr2[j]+" ");
        }
        
        System.out.println();

        char arr1[]=new char[]{'a','b','c'};

        for(int i=0;i< arr1.length;i++)
        {
          System.out.print(arr1[i]+" ");
        }
        System.out.println();
       for(int j=arr1.length-1;j>=0;j--)
        {
          System.out.print(arr1[j]+" ");
        }
        System.out.println();


       String arr3[]=new String[]{"hi","Good","Morning"};

       for(int i=0;i< arr3.length;i++)
       {
         System.out.print(arr3[i]+" ");
       }
       System.out.println();
      for(int j=arr3.length-1;j>=0;j--)
       {
         System.out.print(arr3[j]+" ");
       }

       System.out.println();

       Scanner scan=new Scanner(System.in);
       int l=scan.nextInt();
       int arr4[]= new int[l];
     
       for(int i=0;i< arr4.length;i++)
       {
         arr4[i]=scan.nextInt();
       }
       for(int i=0;i< arr4.length;i++)
       {
           System.out.print(arr4[i]+" ");
       }
       System.out.println();
      for(int j=arr4.length-1;j>=0;j--)
       {
         System.out.print(arr4[j]+" ");
       }
       
       scan.close();

    }
}
