package Assignment2;

public class pattern12 
{
    public static void main(String[] args) 
    {
        int rows = 6;
        int upto = 65;
        char start = 65;
            for (int i = 1;i<=rows;i++)
            {
                for (char j = start;j<=upto;j+=(rows-1))
                {
                    System.out.print(j+" ");
                }
                System.out.println();
                start = ++start;
                upto = upto+rows;
            }
    }
}