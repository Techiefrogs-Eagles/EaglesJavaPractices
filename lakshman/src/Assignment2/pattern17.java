package Assignment2;

public class pattern17 
{
    public static void main(String[] args) 
    {
        int alpha = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++)
            {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }

        
        for (int i = 5; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++)
            {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }
    }
}
