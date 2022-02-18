package Assignment8.StringExcersises;

public class Program9 {

    static boolean isAnagram(String a, String b) 
    {
        String str = a.toLowerCase();
        String str1 = b.toLowerCase();
        char[] chstr = str.toCharArray();
        char[] chstr1 = str1.toCharArray();
        java.util.Arrays.sort(chstr);
        java.util.Arrays.sort(chstr1);
        if(java.util.Arrays.equals(chstr , chstr1))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public static void main(String[] args) {
    
        String a = "Race";
        String b = "Care";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

