package ArrayPractise.ArraysPractise;

public class ArrayTwoDimentionsDemo 
{
    public static void main(String[] args) {
        
    
    int arr[][] = new int[3][3];

     arr[0][0] = 1;
     arr[0][1] = 1;
     arr[0][2] = 1;

     arr[1][0] = 2;
     arr[1][1] = 2;
     arr[1][2] = 2;

     arr[2][0] = 3;
     arr[2][1] = 3;
     arr[2][2] = 3;

     int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

     for(int i = 0;i<arr1.length;i++)
     {
        for(int j = 0;j<arr1.length;j++)
        {
            System.out.print(arr1[i][j]+" ");
        }
        System.out.println();
     }

     int arr2[][] = new int[][] {{1,2},{3,4,5,},{6,7,8,9}};

     for(int i = 0;i<arr2.length;i++)
     {
        for(int j = 0;j<arr2[i].length;j++)
        {
            System.out.print(arr2[i][j]+" ");
        }
        System.out.println();
     }
       
     System.out.println(arr2.getClass().getName());

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
  
             int arr3[]={1,2,3,4,5,6,7,8,9};
             int arr4[]={11,12,13,14,15,16,17,18,19,20};
             System.arraycopy(arr, 2, arr1, 3, 5);     //by using arrcopy replace the values
            
             for (int i : arr4) {
                 System.out.print(i+" ");
                 
             }
             System.out.println();
  
                 
            int jagarr[][]={{1,1},{2,2,2}};                 //jagarr clone
            int[][] jagarr1=jagarr.clone();
  
            jagarr1[0][1]=100;                        //changes in 'jagarr' and jagarr1' because shallow copy the reference. 
  
            for (int i = 0; i < jagarr.length; i++) {
                for (int j = 0; j < jagarr[i].length; j++) {
                    System.out.print(jagarr[i][j]+" ");
                    
                }
                System.out.println();
            }
             String ar[]={"a","b","c","d","e","f","g","h"};
             String ar1[];
           
             ar1=ar.clone();           //exactly copying the elements  using clone  method
             ar1[4]="1";                // done changes in ar1 but there is no impact on  'ar' because  they are in separate memory location. 
                                        //deep copy clone with the single dimention array
            
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
