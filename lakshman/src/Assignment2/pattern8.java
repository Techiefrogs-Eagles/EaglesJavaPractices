package Assignment2;

public class pattern8 
{
    public static void main(String[] args) 
    {
        char rows = 'F';
        char col = rows;
        for (char i = 'A'; i <= rows; i++) 
        {
            for (char j = 'F'; j >= col; j--) 
            {
                System.out.print(j);
            }
            System.out.println();
            col = --col;    
        }
    }
}
