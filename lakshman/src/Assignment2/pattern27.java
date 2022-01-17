package Assignment2;

public class pattern27 
{
    public static void main(String[] args)
    {
        int alpha = 65;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print((char) (alpha + i+j));
            }
            System.out.println();
        }
    }
}
