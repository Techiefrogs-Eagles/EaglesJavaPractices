package Assignment1;

public class armstong {
    public static void main(String[] args) {
        int input = 152;
            int rem;
            int sum = 0;
            int ref;
            ref = input;
            while(input>0)
            {
                rem = input%10;
                sum = (rem*rem*rem)+sum;
                input = input/10;
            }
            if(ref==sum)
            {
            System.out.println("given number is a armstrong number");
            }
            else
            {
            System.out.println("given number is not a armstrong number");
            }
    }    
}
