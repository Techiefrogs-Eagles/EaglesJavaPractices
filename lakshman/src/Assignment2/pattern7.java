package Assignment2;

public class pattern7 
{
    public static void main(String[] args) 
    {
        char rows = 'F';
        char col = 'A';
        for (char i = 'A'; i <= rows; i++) 
        {
            for (char j = rows; j >= col; j--) 
            {
                System.out.print(j);
            }
            System.out.println();
            col = ++col;    
        }
    }
}
