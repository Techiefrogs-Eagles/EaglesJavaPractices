package Assignments8;

public class Pr27 {
    public static void main(String[] args) {  

        String str = "hello";  
        int length = str.length();  
        int temp = 0; 
        String array[] = new String[length*(length+1)/2];  

        for(int i=0; i<length; i++) 
        {    
            for(int j=i; j<length; j++) 
            {  
                array[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        }
        System.out.println("All subsets for given string ");  
        for(int i = 0; i < array.length; i++) 
        {  
            System.out.println(array[i]);  
        }  
    }  
}
