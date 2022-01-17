package Assignment2;

public class pattern23 
{
    public static void main(String[] args) 
    {
        int alpha = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alpha + i) + " ");
            }
            System.out.println();
        }   
    }    
}
