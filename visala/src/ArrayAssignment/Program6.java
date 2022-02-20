package src.ArrayAssignment;

//import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("This is normal elements");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println("This is reverse elements");
       
        int length = arr.length;
        int[] ref = new int[length];
        int temp = 0;
        for (int i = length-1; i >=0; i--) 
        {
            ref[temp] = arr[i];
            temp++; 
        }
        arr = ref;
        for (int c : arr) {
            System.out.print(c+" ");
        }
        
    
    }
}
