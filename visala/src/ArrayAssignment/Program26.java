package src.ArrayAssignment;

public class Program26 {
   /* public static void main(String[] args)
     {
        int[][] a={{1,1,1},{2,2,2},{3,3,3}};
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
            if(j>i)
            {
                System.out.print(0+" " );
            }
          
            else{
                 System.out.print(a[i][j]+" ");
                }
        
            }
         System.out.println();
       
        }
    
    }*/
    public static void main(String[] args) {
        
    
    int[][] a = {{1,0,0},{1,1,0},{1,1,1}};
        int temp = 0;
        int zero = 0;
        for (int i = 0; i < a.length-1; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                zero++;
            }
        }
        for (int i = 0; i < a.length-1; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                if(i<j&&a[i][j]==0)
                {
                    temp++;
                }
            }
        }
        if(temp == zero)
        {
             System.out.println("The given matrix is a lower triangular matrix");
        }
        else
        { 
            System.out.println("The given matrix is not a lower triangular matrix");
        }
    }
}
