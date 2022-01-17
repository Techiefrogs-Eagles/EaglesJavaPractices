package Assignment2;

public class pattern1 {
    public static void main(String[] args) {
        char rows = 'F';
        for (char i = 'A'; i <= rows; i++) 
        {
            for (char j = 'A'; j <= i; j++) 
            {
                System.out.print(j);    
            }
            System.out.println();    
        }
    }
    
}
