package Assignment8.StringExcersises;

public class Program1 
{
        public static void main(String[] args) 
        {
           int vCount = 0;
           int cCount = 0;
           int dcount = 0;
           int scount = 0;
           String str = "hello I am Nemo,I have 1st place";
            str = str.toLowerCase();


            for(int i = 0;i < str.length();i++)
            {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||  str.charAt(i) == 'u')
                {    
                      vCount++;    
                }    
                  else if(str.charAt(i)>= '0' && str.charAt(i)<='9')
                {
                    dcount++;
                }
                 else if(str.charAt(i) == ' ')
                {
                   scount++;  
                }
                else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                {
                    cCount++;
                }

                }    
                System.out.println("The number of vowels exists in the string are: " +vCount);    
                System.out.println("The number of digits exists in the string are: " +dcount);
                System.out.println("The number of space exists in the string are: " +scount);
                System.out.println("The number of consonants exists in the string are: " +cCount);

           }    
            
}
