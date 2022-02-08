package Assignment2;

public class program5 
{
    public static void main(String[] args) 
    {
        int rows = 4;
        int space = rows+1;
        int place = 1;
        for (int i = 1;i<=rows;i++)
        {
            for (int j = 1;j<=i;j++)
            {
                if (j==place)
                place = place + space ;
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
