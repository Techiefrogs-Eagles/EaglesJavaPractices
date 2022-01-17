package Assignment2;

public class pattern25 
{
    public static void main(String[] args) 
    { 
        int thisrow = 1;
        int next = 1;
        int rows = 5;
        int alpha = 65;
        int reverse;

        for (int i=1; i<= rows; i++)
        {
            if (i % 2 == 0) 
            {
                reverse = thisrow + next - 1;
                for (int j = 1; j<=i; j++)
                {
                    System.out.print((char) (reverse+alpha -1)+" ");
                    reverse--;
                    next++;
                }
            }
            else
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print((char) (next+alpha - 1)  +" ");
                    next++;
                }
            }
            System.out.println();
            thisrow++;
        }
    }
}
