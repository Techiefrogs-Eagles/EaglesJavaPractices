package src.ArrayAssignment;

public class program3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};

        System.out.println("This is normal elements");
        for (int i : arr)
         {
            
            System.out.print(i+" ");

         }
         System.out.println();
         System.out.println("This is left rotate elements");
         int n=arr[0];
         for(int j=0;j<arr.length-1;j++)
         {
             arr[j]=arr[j+1];
             
         }
             arr[arr.length-1] = n;
             for (int j : arr) {
                 System.out.print(j+" ");
             }
        }
    }

    

