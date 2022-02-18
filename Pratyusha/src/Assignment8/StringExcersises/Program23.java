package Assignment8.StringExcersises;

public class Program23 {
    public static void main(String[] args) 
    {
        int count = 0;
        String str = "The Nemo is a small fish,and it is an Amazing creature! in the sea.";
        for(int i = 0;i < str.length();i++)
        {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
            str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
            {    
            count++;    
            }    
            }    
            System.out.println("The number of punctuations exists in the string is: " +count);    
       }    
        
    }
    

