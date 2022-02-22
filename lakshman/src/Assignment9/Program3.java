package Assignment9;

public class Program3 
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("normal");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("left rotated");
        int k = arr[0];
        for (int i = 0; i < arr.length-1; i++) 
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = k;
 
        for (int i : arr) 
        {
            System.out.print(i+" ");
        }
    }
}
