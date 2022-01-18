package Assignment2;

public class pattern31 
{
    public static void main(String[] args) 
    {
        int rows = 5;
        int start = (rows * (rows - 1)) / 2;
        int alpha = 65;

        for (int i = 1; i < rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) (alpha + start - 1) + " ");
                start--;
            }
            System.out.println();
        }
    }
}
