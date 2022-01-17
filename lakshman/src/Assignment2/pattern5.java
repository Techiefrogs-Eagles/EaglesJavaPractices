package Assignment2;

public class pattern5 
{
    public static void main(String[] args) 
    {
        char rows = 'F';
       char col = rows;
       for (char i = 'A'; i <= rows; i++) 
       {
            for (char j = col; j >= 'A'; j--) 
            {
                System.out.print(j);
            }
            System.out.println();
            col = --col;    
       }

       for (char i = 'A'; i <= rows; i++) 
       {
            for (char j = i; j >= 'A'; j--) 
            {
                System.out.print(j);
            }
            System.out.println();   
       }
    }
}
