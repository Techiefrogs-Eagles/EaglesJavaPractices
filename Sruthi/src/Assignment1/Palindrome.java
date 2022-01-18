package Assignment1;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121, sum = 0, temp,r; // r is for storing remainder value
        temp = n; // storing number in temporary variable
        while (n > 0)
        {
            r = n % 10; //   // below 3 operations is to reverse the number, so that we can chk if its a palindrome
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) // comparing temporary (actual no stored) no with reveresed number
        System.out.println(sum + " is palindrome number ");
        else
        System.out.println(sum + " is not a Palindrome number");

    }
}



