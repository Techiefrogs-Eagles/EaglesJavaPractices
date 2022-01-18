public class factorial {

    public static void main(String[] args) {
        
        int n =5,i=1;
        int factorial = 1;
        while( i<=n )
        {

        factorial = factorial * i ;

        i++;

         }

    System.out.printf( "factorial of %d = %d" ,n, factorial  );  
    }
}
