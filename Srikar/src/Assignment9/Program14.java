package Assignment9;

import java.util.Arrays;//array topic

public class Program14 {
    public static void main(String[] args) {
      //Its print the output in ascending order

        int[] array = {25,8,1994,19,11,2000};
        Arrays.sort(array);
        for (int c : array) 
        {
            System.out.print(c+" ");
        }
    }
}