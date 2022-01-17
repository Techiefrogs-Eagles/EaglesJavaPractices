package Assignment2;

public class pattern2 
{
    public static void main(String[] args) {
        char rows = 'F';
        for (char i = 'A'; i <= rows; i++) 
        {
            for (char j = 'A'; j <= i; j++) 
            {
                System.out.print(i);    
            }
            System.out.println();    
        }
    }    
}
