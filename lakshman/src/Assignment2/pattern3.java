package Assignment2;

public class pattern3 
{
    public static void main(String[] args) 
    {
       char rows = 'F';
       for (char i = 'A'; i <= rows; i++) 
       {
            for (char j = 'A'; j <= i; j++) 
            {
                System.out.print(j);
            }
            System.out.println();   
       }

       char rows0 = --rows;
       char col = rows0;
       for (char i = 'A'; i <= rows0; i++) 
       {
            for (char j = 'A'; j <= col; j++) 
            {
                System.out.print(j);
            }
            System.out.println();
            col = --col;    
       }

    }
}
