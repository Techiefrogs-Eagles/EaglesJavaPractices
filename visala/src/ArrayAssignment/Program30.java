package src.ArrayAssignment;

public class Program30 {
    public static void main(String[] args) {
        int[][] a={{1,1,1},{2,2,2},{3,3,4}};

        for (int i = 0; i < a.length; i++) 
        {
            int sum=0;
            for (int j= 0; j < a[i].length; j++)
             {
            sum=sum+a[i][j];
            }
            System.out.print("Sum of row= " +sum);
        
            System.out.println();
        }
        
        for (int i = 0; i < a.length; i++) 
        {
            int sum=0;
            for (int j= 0; j < a[i].length; j++)
             {
            sum=sum+a[j][i];
            }
            System.out.print("Sum of col  = " +sum);
        
            System.out.println();
        }
    }
    
}

    

