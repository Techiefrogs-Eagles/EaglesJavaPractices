package Kssfolder;

import java.util.Arrays;

public class ToString 
{
    public static void main(String[] args) 
    {
        int newarr[] = new int[]{1,2,3,4,5};
       // int search = 3;
       Arrays.fill(newarr , 20);

      //  System.out.println("the array passed toString is:"+newarr.toString());
        //System.out.println("the array passed toString is:"+Arrays.binarySearch(newarr, search));
        System.out.println("the array passed tofill is:"+Arrays.toString(newarr));

    }
}
