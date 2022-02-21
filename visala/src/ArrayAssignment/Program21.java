package src.ArrayAssignment;

import java.util.Arrays;

public class Program21 {
    public static void main(String[] args) {
        char array[] = {'a','b','c','f','a','c','g','f'};
        Arrays.sort(array);
        for (char c : array) 
        {
            System.out.print(c+" ");
        }
    }
    
}
