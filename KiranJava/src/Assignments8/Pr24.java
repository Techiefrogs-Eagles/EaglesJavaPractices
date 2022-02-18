package Assignments8;

import java.util.Scanner;

public class Pr24 {
    public static void main(String[] args) {
        
    
        String str;
        int vCount=0,cCount=0;
        
         Scanner scan=new Scanner(System.in); 
           
            
       System.out.println("Enter the String  ");
        str=scan.nextLine();
        for(int i=0; i<=str.length()-1; i++){
        char ch=str.charAt(i);
        if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' // check vowels
            ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
                vCount++;
            }
            else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){  //check consonants
                cCount++;
            }
           
        }
        scan.close();
        System.out.println("\nTotal Vowels: "+vCount);//display total number of vowels
        System.out.println("Total consonants: "+cCount);// display total number of consoanats
        
        }
}
