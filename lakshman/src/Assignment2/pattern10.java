package Assignment2;

public class pattern10 
{
    public static void main(String[] args) 
    {
        int rows = 6;
            int input=rows;
            int till=0;
            for(int i=1;i<=input;i++) 
            {
                till=till+i;
            }
            int alpha = 64;
            int floyd = 1; 
            for (int i = 1;i<=rows;i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print((char)(floyd+alpha)+" ");
                    floyd = floyd+1;
                }
                System.out.println();
                
            }
    }    
}
