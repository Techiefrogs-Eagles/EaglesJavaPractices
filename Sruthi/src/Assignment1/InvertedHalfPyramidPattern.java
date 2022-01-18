package Assignment1;

public class InvertedHalfPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // no. of rows to get printed
        for(int i = n; i <= 1; i++) 
        {
            for(int j = 1; j <= i; j++) // inner loop prints the value and also inner loop is in control of outer loop
            {
                System.out.print("* "); // to create * pattern
            }
                System.out.println();
        } 
    }
        
        
}
