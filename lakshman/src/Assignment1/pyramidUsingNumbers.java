package Assignment1;

public class pyramidUsingNumbers 
{
    public static void main(String[] args) 
    {
        int rows = 5;
        int upto = 1;
        int space = rows+rows-2;
        int part2 = 0;
        for (int i = 1; i <= rows; i++) 
        {
            for (int k = space; k >= 1 ; k--) 
                {
                    System.out.print(" ");    
                }
            for (int j = i; j <= upto; j++) 
            {
                System.out.print(j+" ");
            }
            for (int m = part2; m >= i; m--) 
            {
                System.out.print(m+" ");
            }
            System.out.println();
            upto = upto+2;
            space = space-2;
            part2 = part2 + 2;
        }
    }
}
