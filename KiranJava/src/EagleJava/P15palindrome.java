package EagleJava;import java.util.Scanner;

public class P15palindrome {
   public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = reader.nextInt();
    reader.close();
    int temp=num,sum=0,i;
    while(num>0){
      i=num%10;
      sum=(sum*10)+i;
      num=num/10;
    }
    if (sum==temp) {
        System.out.println("palindrome");
    } else {
        System.out.println("notPalindrome");
    }

   } 
        
   
        
    
}
