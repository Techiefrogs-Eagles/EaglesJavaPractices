package Assignment9Arrays;

import java.util.Arrays;

public class Program4 
{
    public static void main(String[] args) {
        String a[] = {"My puppy name is Rocky","My puppy name is Rocky"};
        Arrays.sort(a);
        for(String b : a)
        {
            System.out.println(b+" ");
        }
        System.out.println();
        String[] a1 = new String[a.length];
        int temp = 0;
        for( int i = 0; i < a.length-1 ; i++)
        {
            if(a[i] == a[i+1])
            {
                a1[temp] = a[i];
                temp++;
            }
        }
        for (String c : a1) 
        {
            System.out.print(c+" ");
        }

    }
}
