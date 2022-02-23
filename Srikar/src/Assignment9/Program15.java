package Assignment9;

import java.util.Arrays;

public class Program15 {
    public static void main(String[] args) {
        //Its print the output in descending order
        int[] array = {18,20,445,78,96,45,3654};
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