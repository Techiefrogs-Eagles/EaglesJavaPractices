package Assignments9;

import java.util.Arrays;

public class Pr21 {
    public static void main(String[] args) {
        int[] array = {230,329,324,424,7,23};
        Arrays.sort(array);
        System.out.print("ascending order of array    ");
        for (int c : array) 
        {
            System.out.print(c+" ");
        }
    }
}
