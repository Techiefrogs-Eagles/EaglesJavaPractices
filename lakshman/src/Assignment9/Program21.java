package Assignment9;

import java.util.Arrays;

public class Program21 {
    public static void main(String[] args) {
        char array[] = {'a','B','c','f','k','Z','Z','B','C','Z','k'};
        Arrays.sort(array);
        for (char c : array) 
        {
            System.out.print(c+" ");
        }
    }
}
