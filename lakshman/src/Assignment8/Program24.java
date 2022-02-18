package Assignment8;

public class Program24 
{
    public static void main(String[] args) 
    {
        int num1 = 0;
        int num2 = 0;     
        String str = "This is a really simple sentence";    
    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) 
        {   
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {  
                num1++;    
            }  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
            {        
                num2++;    
            }    
        }    
        System.out.println("Number of vowels: " + num1);    
        System.out.println("Number of consonants: " + num2);    
    } 
}
