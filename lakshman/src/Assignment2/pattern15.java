package Assignment2;

public class pattern15 
{
    public static void main(String[] args) 
    {
        int rows = 6;
        int upto = rows+(65-1);
        int col = rows+(65-1);
        int space = rows-1;

        for (int i = 65; i <= upto; i++) 
        {
            for (int k = rows; k <= space ; k++) 
                {
                    System.out.print(" ");    
                }
            for (int j = 65; j <= col; j++) 
            {
                System.out.print(((char)j)+" ");
            }
            System.out.println();
            col = col-1;
            space = space+1;    
        }  
    }    
}
