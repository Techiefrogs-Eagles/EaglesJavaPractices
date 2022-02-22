package Basicpractises;

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


     







    }
}
