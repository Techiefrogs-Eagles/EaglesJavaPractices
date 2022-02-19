package Assignment8;

import java.util.*;

public class Program9 {

    static boolean isAnagram(String a, String b) {
        String str = a.toLowerCase();
        String str1 = b.toLowerCase();
        char[] chstr = str.toCharArray();
        char[] chstr1 = str1.toCharArray();
        Arrays.sort(chstr);  
        Arrays.sort(chstr1); 
        if(Arrays.equals(chstr , chstr1)){
            return true;
        }
        else{
            return false;
        }         
    }

    public static void main(String[] args) {
    
        String a = "Hello JaVA";
        String b = "llojeaavh ";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
