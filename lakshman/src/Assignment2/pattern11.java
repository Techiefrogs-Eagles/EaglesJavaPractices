package Assignment2;

public class pattern11 
{
    public static void main(String[] args) 
    {
        int alpha = 64;
        int rows = 6;
        int col = 1;
        int con = 1;
        for (int i = 1; i <= rows; i++) 
        {
            int j = col;
            while(j <= i)
            {
                if (j == con)
                {
                    System.out.print("A");
                    break;
                }
                else 
                {
                    System.out.print((char)(j+alpha));
                }
                j--;
            }
            System.out.println();
            col = col+1;    
        }
    }    
}
