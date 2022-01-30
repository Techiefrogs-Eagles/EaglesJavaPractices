package EagleJava;import java.util.Scanner;

public class P9SumofN {
    public static void main(String[] args) {
        int sum=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N value: ");
        int n=sc.nextInt();
        sc.close();
        for(i=n;i>=1;i--)
          sum=sum+i;
        System.out.println("Sum of first "+ n + " natural numbers is "+ sum);

    }
    
}
