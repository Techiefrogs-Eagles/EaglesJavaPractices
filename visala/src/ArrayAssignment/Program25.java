package src.ArrayAssignment;

public class Program25 {
    public static void main(String[] args) {
        
    int a[][] = {{1,1,1},{2,2,2}};
        int b[][] = {{1,1,1},{2,2,2}};
        int c = 0;
        int d = 0;

        int e = 0;

        for(int i = 0;i < a.length; i++)
        {
            c = c+a[i].length;
        }
        for(int j = 0;j < b.length; j++)
        {
            d = d+b[j].length;
        }

        if(c==d)
        {

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                   if(a[i][j]==b[i][j])
                   {
                      e++;
                   }
                }
            }
            
                 if(e==c)
            {
                System.out.println("The two Matrices are equal :");
            }
            else
            {
                    System.out.println("The two matrices are not equal :");
            }
        }
            else
            {
                       System.err.println("The two matrices are not equal :");
            }
        }
    }
    
    

