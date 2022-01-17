package Assignment2;

public class pattern28 
{
    public static void main(String[] args)
    {
        int alpha = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j < 5-i; j++)
            {
                System.out.print((char) (alpha + j));
            }
            for (int k = 5-i-2; k >= 0; k--)
            {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }
    }
}
