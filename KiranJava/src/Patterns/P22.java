public class P22 {
    public static void main(String[] args) {
        int row=5, i, j, space = row-1;
       
        /*for (j = 1; j<= row; j++)  
        {  
            for (i = 1; i<= space; i++)  
                {  
                    System.out.print(" ");  
                }  
                space--;  
            for (i = 1; i <= 2 * j - 1; i++)  
                {  
                    System.out.print("* ");  
                }  
            System.out.println("");  
        }*/
        space = 1;  
        for (j = 0; j<= row ; j++)  
            { 
            for (i = 1; i<= space; i++)  
                {  
                    System.out.print(" ");  
                }  
                space++;  
            for (i = 1; i<= 2 * (row - j) - 1; i++)  
                {  
                    System.out.print("* ");
                      
                }  
            System.out.println("");
              
            }  
    }
}
