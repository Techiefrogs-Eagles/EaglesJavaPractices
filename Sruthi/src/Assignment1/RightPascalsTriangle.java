package Assignment1;

public class RightPascalsTriangle {
    public static void main(String[] args) {
        for(int row = 1; row <= 8; row++) 
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print(" *"); // to create * pattern
            }
                System.out.println(); // To print in Nxt line
        } 
        for(int row = 7; row >= 0; row--) // reversed the half pyramid
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print(" *"); // to create * pattern
            }
                System.out.println(); // To print in Nxt line
        } 
    }
}
