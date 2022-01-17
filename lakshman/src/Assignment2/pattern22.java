package Assignment2;

public class pattern22 
{
    public static void main(String[] args) 
    {
        int alpha = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = i; j <= 5; j++)
            {
                System.out.print((char) (alpha + j) + " ");
            }
            for (int k = 5 - 1; k >= i; k--)
            {
                System.out.print((char) (alpha + k) + " ");
            }
            System.out.println();
        }
    }
}
