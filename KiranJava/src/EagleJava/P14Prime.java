package EagleJava;import java.util.Scanner;

public class P14Prime {
    public static void main(String[] args) {
        int i,e=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        sc.close();
    if(n==0||n==1) System.out.println("not Prime number");
    else{
    for(i=2;i<n;i++)
        {
        if(n%i==0) 
        {System.out.println("Not a Prime number");
         e=e+1;
         break;
        }
    }
    if(e==0)
    System.out.println("It is prime number");

    }
    
}
}
