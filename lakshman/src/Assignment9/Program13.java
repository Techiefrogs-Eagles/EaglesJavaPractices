package Assignment9;

public class Program13 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("normal");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("right rotated");
        int k = arr[arr.length-1];
        for (int i = arr.length-1; i >0; i--) 
        {
            arr[i] = arr[i-1];
        }
        arr[0] = k;
 
        for (int i : arr) 
        {
            System.out.print(i+" ");
        }
    }
}
