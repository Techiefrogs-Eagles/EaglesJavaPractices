package src.ArrayAssignment;

public class Program33 {
    public static void main(String[] args) {
        
        int a[][]={{1,1},{2,2},{3,3,3}};
        int b[][]={{1,1},{2,2,2},{3,3,3}};
      

      
        int c=a.length;
        int d[][]=new int[c][a[c-1].length];
        for (int i = 0; i < c; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
              
                d[i][j]+=a[i][j]*b[i][j];
                System.out.print(d[i][j]+" ");
            }
            
            System.out.println();
    
        }
        
           
        
        }
    }
    
    

