package Kssfolder;

public class Multidime 
{
    public static void main(String[] args) 
    {
        int[][] x = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0 ;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }

    }
    
}
