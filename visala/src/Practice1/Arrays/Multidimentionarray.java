package src.Practice1.Arrays;



public class Multidimentionarray {
    public static void main(String[] args) {

      //ADDITION OF TWO MATRICES

     /*   int a[][]={{1,1,1},{2,2,2},{3,3,3}};
    
        int b[][]={{2,2,2},{3,3,3},{1,1,1}};

        int c[][]=new int[3][3];
        for (int i = 0; i < a.length; i++) {
         
            for (int j = 0; j < a[i].length; j++) {
               c[i][j]=a[i][j]+b[i][j];

                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
*/
   //ADDITION OF JAGGED ARRAY


   /*     int a[][]={{1,1},{2,2,2}};
        int b[][]={{2,2},{1,1,1}};
      
        int c=a.length;
        int d[][]=new int[c][a[c-1].length];
        for (int i = 0; i < c; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
              
                d[i][j]=a[i][j]+b[i][j];
                System.out.print(d[i][j]+" ");
            }
            
            System.out.println();
    
        }*/

        //MULITIPLICATION OF TWO MATRICES

        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
      

        int d[][]=new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
              for(int k = 0;k < 3; k++)
              {
                
                d[i][j]+=a[i][k]*b[k][j];
              }
                System.out.print(d[i][j]+" ");
            }
            
               System.out.println();
            
        }
 String sarr[]={"a","b","c","d","e","f","g","h"};

 String sarr2[]=new String[10];


        System.out.println(a.getClass().getName());
        String sarr1[][]=new String[3][3];
        System.out.println(sarr1.getClass().getName());
        System.arraycopy(sarr, 2, sarr2, 3, 5);
       for (String s : sarr2) {
           System.out.print(s+" ");
       }
           System.out.println();

           int arr[]={1,2,3,4,5,6,7,8,9};
           int arr1[]={11,12,13,14,15,16,17,18,19,20};
           System.arraycopy(arr, 2, arr1, 3, 5);     //by using arrcopy replace the values
          
           for (int i : arr1) {
               System.out.print(i+" ");
               
           }
           System.out.println();

               
          int jagarr[][]={{1,1},{2,2,2}};                 //jagarr clone
          int[][] jagarr1=jagarr.clone();

          jagarr1[0][1]=100;                        //chainge in 'jagarr' and jagarr1' because shallow copy the reference. 

          for (int i = 0; i < jagarr.length; i++) {
              for (int j = 0; j < jagarr[i].length; j++) {
                  System.out.print(jagarr[i][j]+" ");
                  
              }
              System.out.println();
          }
           String ar[]={"a","b","c","d","e","f","g","h"};
           String ar1[];
         
           ar1=ar.clone();           //exact copy by using clone
           ar1[4]="1";                //chaings only in 'ar1' ,not impact  the 'ar' because saparate memory location 
                                      //deep copy cloe with the single dimention array
          
           for (String s : ar1) {
              System.out.print(s+" ");
          }
          System.out.println();
       
          System.out.println(arr1==arr);
          System.out.println(jagarr==jagarr1);
          System.out.println(arr.equals(arr1));
          System.out.println(jagarr.equals(jagarr1));
        
       }
    }


