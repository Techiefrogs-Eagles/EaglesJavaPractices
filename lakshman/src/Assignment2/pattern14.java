package Assignment2;

public class pattern14 
{
    public static void main(String[] args) 
    {
        int rows = 6;
        int lastLetter = rows + 65;
        int upto = 65;
        int part2 = 64;
        for (int i = 65; i <= lastLetter; i++) 
        {
            for (int j = 65; j <= i; j++) 
            {
                System.out.print(((char)j)+" ");
            }
            for (int m = part2; m >= 65; m--) 
            {
                System.out.print(((char)m)+" ");
            }
            System.out.println();
            upto = upto+2;
            part2 = part2 +1;
        }
    }
}
