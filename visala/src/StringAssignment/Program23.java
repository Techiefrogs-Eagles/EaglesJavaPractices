package src.StringAssignment;

public class Program23 {
    public static void main(String[] args) {
        int count = 0;    
      String str = "I have a small kid, And her name Mokshitha.\'; ";    
for (int i = 0; i < str.length(); i++)   
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
