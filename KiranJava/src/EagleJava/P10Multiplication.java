package EagleJava;import java.util.Scanner;

public class P10Multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        sc.close();
        for( int i=1;i<=10;i++)
        {
         //System.out.printf("%d * %d =%d \n",n ,i,n*i);
         System.out.println(n +" * "+ i + " = " + n*i);
        }
    }
    
}
