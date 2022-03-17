package Kssfolder;

public class JaggedArray 
{
    public static void main(String[] args) 
    {
        int[][] x1 = new int[4][];
        x1[0] = new int[1];
        x1[1] = new int[2];
        x1[2] = new int[3];
        x1[3] = new int[4];
        int i,j,k = 0;
        for( i = 0;i<4;i++)
        {
            for(j=0;j<i+1;j++)
            {
                x1[i][j]=k;
                k++;
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<i+1;j++)
            {
                System.out.print(x1[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
