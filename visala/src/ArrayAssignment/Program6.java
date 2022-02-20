package src.ArrayAssignment;

public class Program6 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println("This is normal elements");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println("This is reverse elements");

        int n=arr[0];
         for(int j=0;j>arr.length-1;j++)
         {
             arr[j]=arr[j-1];
             
         }
             arr[arr.length-1] = n;
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
    
}
