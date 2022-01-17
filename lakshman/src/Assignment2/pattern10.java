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
            char floyd = 'A'; 
            for (int i = 1;i<=rows;i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    System.out.print(floyd+" ");
                    floyd = ++floyd;
                }
                System.out.println();
                
            }
    }    
}
