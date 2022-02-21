package src.ArrayAssignment;

import java.util.Arrays;

public class Program15 {
    public static void main(String[] args) {
        
            int[] array = {15,36,21,3};
          
            int[] ref = new int[array.length];
            Arrays.sort(array);
            int temp = 0;
            
            for (int i =array. length-1; i >=0; i--) 
            {
                ref[temp] = array[i];
                temp++; 
            }
            for (int i : ref) {
                System.out.print(i+" ");
            }
        }
    }
    

