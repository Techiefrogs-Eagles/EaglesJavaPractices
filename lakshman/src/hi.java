public class hi
{
public static void main(String[] args)
 {
    int rows = 6;
        int upto = 1;
        int start = 1;
            for (int i = 1;i<=rows;i++)
            {
                for (int j = start;j<=upto;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
                start = start+1;
                upto = upto+rows;
            }
 }
}