package src.StringAssignment;

public class Program33 {
    
    public static void main(String[] args)
     {
         String str = "abcdcba";
         int length= str.length();
         String ref= "";
         for(int i=length; i>=1;i--)
         {
             ref=ref+str.charAt(i-1);
         }
         System.out.println(ref);
         if(ref.equals(str))
         {
             System.out.println("Given String is a palandrom");

         }
         else
         {
             System.out.println("Given string is a not palandrom");
         }
    }
}

    

