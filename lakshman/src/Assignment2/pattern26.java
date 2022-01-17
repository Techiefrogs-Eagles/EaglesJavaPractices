package Assignment2;

public class pattern26 
{
    public static void main(String[] args) 
    { 
        int thisrow = 1;
        int next = 1;
        int rows = 5;
        int alphabet = 65;
        int reverse;
        
        for (int i=1; i<= rows; i++)
        {
            if (i % 2 == 0) 
            {
                for (int j = 1; j<=i; j++)
                {
                    System.out.print((char) (next+alphabet - 1)  +" ");
                    next++;
                }
            }
            else
            {
                reverse = thisrow + next - 1;
                for (int j = 0; j<i; j++)
                {
                    System.out.print((char) (reverse+alphabet -1)+" ");
                    reverse--;
                    next++;
                }
            }
            System.out.println();
            thisrow++;
        }
    }
}
