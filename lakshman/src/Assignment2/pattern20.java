package Assignment2;

public class pattern20 
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
                System.out.print((char) (alpha + k));
            }
            for (int l = i - 1; l >= 0; l--)
            {
                System.out.print((char) (alpha + l));
            }
            System.out.println();
        } 
    }
}
