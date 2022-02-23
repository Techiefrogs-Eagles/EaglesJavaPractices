package src.ArrayAssignment;

public class Program33 {
    public static void main(String[] args)
     {
        
        int a[][]={{1,1},{2,2},{3,3,3}};
        int b[][]={{1,1},{2,2},{3,3,3}};
      

       
        for (int i = 0; i < a.length; i++) 
        {
            int d[][]=new int[a.length][a[i].length];
            for (int j = 0; j < a[i].length; j++) 
            {
              for(int k = 0;k < d.length; k++)
              {
                
                d[i][j]+=a[i][k]*b[k][j];
              }
                System.out.print(d[i][j]+" ");
            }
            
               System.out.println();
            
        }
    }
}

    
    

    
    
    

