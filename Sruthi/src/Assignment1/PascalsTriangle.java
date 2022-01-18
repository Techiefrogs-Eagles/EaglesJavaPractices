package Assignment1;

public class PascalsTriangle {
    public static void main(String[] args) {
        int row = 6,c = 1;
        for(int i=0;i<row;i++)
        {
            for(int blk=1;blk<=row-i;blk++)
            System.out.print(" ");
            for(int j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                   c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
        
    }
}

        
        
    
    

