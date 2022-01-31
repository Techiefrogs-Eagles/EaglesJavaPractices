package Assignment2;

public class pattern5 
{
    public static void main(String[] args) 
    {
        int alpha = 64;
        int rows = 6;
        int col = rows;
        for (char i = 1; i <= rows; i++) 
        {
            for (int j = col; j >= 1; j--) 
            {
                System.out.print((char)(j+alpha));
            }
            System.out.println();
            col = col-1;    
        }

        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j >= 1; j--) 
            {
                System.out.print((char)(j+alpha));
            }
            System.out.println();   
        }
    }
}
