package Assignment8;

import java.util.Arrays;

public class Program18 
{
    public static void main(String[] args) {
        String str = "good morning";
         char array[] = str.toCharArray();
         Arrays.sort(array);
        for(char i : array)
        {
            System.out.print(i+" ");
        }
    }
}
