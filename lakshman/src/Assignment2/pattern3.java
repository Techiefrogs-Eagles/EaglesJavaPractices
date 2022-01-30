package Assignment2;

public class pattern3 
{
    public static void main(String[] args) 
    {
        int alpha = 64;
       int rows = 6;
       for (int i = 1; i <= rows; i++) 
       {
            for (char j = 1; j <= i; j++) 
            {
                System.out.print((char)(j+alpha));
            }
            System.out.println();   
       }

       int rows0 = --rows;
       int col = rows0;
       for (int i = 1; i <= rows0; i++) 
       {
            for (int j = 1; j <= col; j++) 
            {
                System.out.print((char)(j+alpha));
            }
            System.out.println();
            col = col-1;    
       }

    }
}
