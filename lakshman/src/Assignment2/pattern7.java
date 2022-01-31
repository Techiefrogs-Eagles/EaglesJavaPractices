package Assignment2;

public class pattern7 
{
    public static void main(String[] args) 
    {
        int alpha = 64;
        int rows = 6;
        int col = 1;
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = rows; j >= col; j--) 
            {
                System.out.print((char)(j+alpha));
            }
            System.out.println();
            col = col+1;    
        }
    }
}
