package Assignment14;

import java.util.HashSet;

public class Program13 {
    public static void main(String[] args) {
        // array to hashset
        String arr[] = {"A","B","C","D","E"};

        HashSet<String> obj = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            obj.add(arr[i]);
        }

        System.out.println(obj);

        //hashset to array
        Object arr1[] = obj.toArray();
        for (Object object : arr1) {
            System.out.print(object+" ");
        }
        
    }
}
