package Assignment1;

public class HalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i = 1; i <= n; i++) // printing * in row
        {
            for(int j = 1; j <= i; j++) // printing * column
            {
                System.out.print("  *"); // to create * pattern
            }
                System.out.println(); // To print in Nxt line
        } 
    }

}

