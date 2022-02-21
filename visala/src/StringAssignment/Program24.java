package src.StringAssignment;

public class Program24 {
    public static void main(String[] args) {
       
        int vCount = 0, cCount = 0;     
            String str = "There is a very small puppy and it named as Rocky";      
            str = str.toLowerCase();    
             for(int i = 0; i < str.length(); i++) 
            {      
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
                {    
                    
                    vCount++;    
                }    
                  
                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
                {      
                    cCount++;    
                }    
            }    
            System.out.println("Number of vowels: " + vCount);    
            System.out.println("Number of consonants: " + cCount);    
        }    
    }

