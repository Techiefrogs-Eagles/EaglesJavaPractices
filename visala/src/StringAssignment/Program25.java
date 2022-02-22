package src.StringAssignment;

import java.util.Arrays;

public class Program25 {
    
    static boolean isAnagram(String a, String b) {
        String s = a.toLowerCase();
        String s1 = b.toLowerCase();
        char[] chs = s.toCharArray();
        char[] chs1 = s1.toCharArray();
        Arrays.sort(chs);  
        Arrays.sort(chs1); 
        if(Arrays.equals(chs , chs1)){
            return true;
        }
        else{
            return false;
        }         
    }

    public static void main(String[] args) {
    
        String a = "Hello HAi";
        String b = "iahHeLLo ";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
}
