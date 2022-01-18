package Assignment2;

public class pattern30 
{
    public static void main(String[] args) 
    {
        int rows = 5;
        int alpha = 65;
        
        for(int i=0;i<= rows;i++)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alpha+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows)    
                    System.out.print((char)(alpha+l));
            }
           System.out.println();
        }
        
        for(int i=rows-1;i>=0 ;i--)
        {
            for(int j=0;j<=rows-i;j++)
            {
                System.out.print((char)(alpha+j));
            }
            for(int k=1;k<=i*2-1; k++)
            {
                System.out.print(" ");
            }
            for(int l=rows-i; l>=0; l--)
            {
                if(l!=rows) 
                    System.out.print((char)(alpha+l));
            }
           System.out.println();
        }
    }
}
