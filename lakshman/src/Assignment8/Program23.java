package Assignment8;

public class Program23 
{
    public static void main (String args[])   
    {    
        int num = 0;    
        String str = "Hello sir, i am practicing java, python. ; ' : , . / \" . ";    
        for (int i = 0; i < str.length(); i++)   
        {   
            if(str.charAt(i) == ',' || str.charAt(i) == '?' || str.charAt(i) == ';' || str.charAt(i) == ':' ||  str.charAt(i) == '.' || str.charAt(i) == '-' ||    
            str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == '!')   
            {    
                num++;    
            }    
        }    
        System.out.println("The number of punctuations in the string-- " +num);    
    }    
}
