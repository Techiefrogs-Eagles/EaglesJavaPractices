package Assignments8;

public class Pr26 {
    public static void main(String[] args) {
        String str = "abcdefghijkl";  

        int length = str.length();    
        int num = 3;  
        int temp = 0;
        int numChars = length/num;
        String[] StrArray = new String [num];    
        if(length % num != 0) 
        {  
            System.out.println("string cannot be divided into "+ num +" equal parts");  
        }  
        else 
        {  
            for(int i = 0; i < length; i = i+numChars) 
            {  
                String temp1 = str.substring(i, i+numChars);  
                StrArray[temp] = temp1;  
                temp++;  
            }  
            System.out.println(num + " equal parts of given string ");  
            for(int i = 0; i < StrArray.length; i++) 
            {  
                System.out.println(StrArray[i]);  
            }  
        }  
    }
}
