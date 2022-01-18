package Assignment1;
// Formula for finding sum of natural no is 1,2,3..(n-2),(n-1),n = n(n+1)/2
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 100, sum = 0; // here we're finding sum of 1st 100 numbers
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println("The sum of first 100 number is  " +sum);
    }
}
