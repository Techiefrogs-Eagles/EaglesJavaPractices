package Assignment9;

public class Program12 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5}; 
        int length = array.length;
        int sum = 0;
        for (int i = length-1; i >=0; i--) 
        {
             sum = sum+array[i];
        }
        System.out.println("sum of elements in array = "+sum);
    }
}
