package Assignment14Hashset;

import java.util.HashSet;

public class Prg13 
{
    public static void main(String[] args) 
    {
        String arr[] = {"1","2","3"};        //array to hashset
        
        HashSet<String> obj = new HashSet<>(); 
        for(int i = 0;i < arr.length; i++)
        {
            obj.add(arr[i]);
        }
        System.out.println(obj);

        Object arr1[] = obj.toArray();        //Hashset to array
        for(Object obj1 : arr1)
        {
            System.out.println(obj1+" ");
        }
        
        
    }
}
