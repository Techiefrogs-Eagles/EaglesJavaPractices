package Assignment2;

public class pattern16 
{
    public static void main(String[] args) 
    {
        int rows = 6;
        int upto = rows+(65-1);
            int space = 65;
            for (int i=65;i<=upto;i++) 
            {
                for (int k=upto;k>=space;k--)
                {
                    System.out.print(" ");
                }
                for (int j=65;j<=i;j++)
                {
                    System.out.print((char)j+" ");
                }
                System.out.println();
                space = space+1;
            }

            int rows0 = rows - 1;
            int upto0 = rows0+(65-1);
            int col0 = rows0+(65-1);
            int space0 = rows0-1;
            int spacestart = rows0-2;

            for (int i = 65; i <= upto0; i++) 
            {
                for (int k = spacestart; k <= space0 ; k++) 
                    {
                        System.out.print(" ");    
                    }
                for (int j = 65; j <= col0; j++) 
                {
                    System.out.print(((char)j)+" ");
                }
                System.out.println();
                col0 = col0-1;
                space0 = space0+1;    
        }  
    
    }
}
