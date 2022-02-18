package Assignment8;

public class Program1 {
    public static void main(String[] args) {
        int vnum = 0;
        int cnum = 0;
        int dnum = 0;
        int snum = 0;    
        String str = "Hello sir, i am practicing java, python1.21212 4 ; ' : , . / \" . ";
        str = str.toLowerCase();    
        for (int i = 0; i < str.length(); i++)   
        {   
            if(str.charAt(i) == ' ')   
            {    
                snum++;    
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                dnum++;
            }
            else if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == ':' ||  str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                vnum++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                cnum++;
            }

        }    
        System.out.println("The number of spaces in the string-- " +snum);
        System.out.println("The number of digits in the string-- " +dnum);
        System.out.println("The number of vowels in the string-- " +vnum);
        System.out.println("The number of consonents in the string-- " +cnum);
    }
}
