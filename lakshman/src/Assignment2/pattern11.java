package Assignment2;

public class pattern11 
{
    public static void main(String[] args) 
    {
        char rows = 'F';
        char col = 'A';
        char con = 'A';
        for (char i = 'A'; i <= rows; i++) 
        {
            char j = col;
            while(j <= i)
            {
                if (j == con)
                {
                    System.out.print("A");
                    break;
                }
                else 
                {
                    System.out.print(j);
                }
                j--;
            }
            System.out.println();
            col = ++col;    
        }
    }    
}
