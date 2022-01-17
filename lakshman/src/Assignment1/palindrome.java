package Assignment1;

public class palindrome {
    public static void main(String[] args) {
        int input = 121;
            int rem;
            int sum = 0;
            int ref;
            ref = input;           
            while(input>0)            
            {                         
                rem = input%10;
                sum = (sum*10)+rem;
                input = input/10;
            }
            if(ref==sum)
            {
            System.out.println("given number is a palindrome");
            }
            else
            {
            System.out.println("given number is not a palindrome");
            }
    }
}
