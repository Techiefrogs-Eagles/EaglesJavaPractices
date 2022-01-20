import java.util.Scanner;

public class P8Facto {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter n ");
        int n=sc.nextInt();
        sc.close();
        for(int i=2;i<=n;i++)
         fact=fact*i;
        System.out.println("Factorial of "+ n +" is "+ fact);
    }
    
}
