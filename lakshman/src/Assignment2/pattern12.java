package Assignment2;

public class pattern12 
{
    public static void main(String[] args) 
    {
        int rows = 6;
        int upto = 1;
        int start = 1;
        int alpha = 64;
            for (int i = 1;i<=rows;i++)
            {
                for (int j = start;j<=upto;j+=(rows-1))
                {
                    System.out.print((char)(j+alpha)+" ");
                }
                System.out.println();
                start = start+1;
                upto = upto+rows;
            }
    }
}