package Conversions;

public class StringToChar 
{
    public static void main(String[] args) 
    {
        String s = "Hello";

        char c = s.charAt(1);

        System.out.println("The Secong Character is : " + c);  //conversion of String to char  using charAt method


        for(int i = 0; i<s.length(); i++)
        {
            char c1 = s.charAt(i);

            System.out.println("char at " + i +" index is : " + c1 );  
        }

        char[] c2 = s.toCharArray();   

             for(int i=0;i<c2.length;i++)
             {    
                  System.out.println("charArray at "+i+" index is: "+c2[i]);    //coversion of String to char using CharArray[]
             }  
    }
}
