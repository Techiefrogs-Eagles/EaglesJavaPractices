package Assignment9;

import java.util.Arrays;

public class Program15 {
    public static void main(String[] args) {
        int[] array = {20,3,34,43,7};
        int length = array.length;
        int[] ref = new int[length];
        Arrays.sort(array);
        int temp = 0;
        for (int i = length-1; i >=0; i--) 
        {
            ref[temp] = array[i];
            temp++; 
        }
        for (int i : ref) {
            System.out.print(i+" ");
        }
    }
}
