import java.util.Scanner;

public class leftpascal {
    public static void main(String[] args) {
        
    
Scanner sc = new Scanner(System.in);
		
		int i, j, k;
		
		System.out.print("Enter Left Pascals Number Triangle Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Left Pascals Triangle Number Pattern");
		
		for (i = 1 ; i <= rows; i++ ) 
		{
			for (j = i ; j < rows; j++ ) 
			{
				System.out.print("  ");
			}
			for(k = 1; k <= i; k++) 
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		for (i = rows; i >= 1; i-- ) 
		{
			for (j = i ; j <= rows; j++ ) 
			{
				System.out.print("  ");
			}
			for(k = 1; k < i; k++) 
			{
				System.out.print(k + " ");
			}
			System.out.println();
        }
    }
}
