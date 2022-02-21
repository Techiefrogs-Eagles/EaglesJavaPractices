package assignment9;

public class problem1 {
    public static void main(String[] args) {
        int vCount=0;
        int cCount=0;
        int sCount=0;
        int dCount=0;
        String str =" Hello john, are you 1st inthe class";
        str =str.toLowerCase();
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
            str.charAt(i)=='o' || str.charAt(i)=='u'){
                vCount++;
            }
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                dCount++;
            }
            if(str.charAt(i)==' '){
                sCount++;
            }
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                cCount++;
            }

        }
        System.out.println("Number of consonants in a line :"+cCount);
        System.out.println("Number of spaces in a line:"+sCount);
        System.out.println("Number of digits in aline:"+dCount);
        System.out.println("Number of vowels in aline:"+vCount);
    }
    
}
