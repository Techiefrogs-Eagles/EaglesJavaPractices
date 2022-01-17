package Assignment2;

public class pattern6 
{
    public static void main(String[] args) 
    {
        char rows = 'F';
            char till = rows;
            char space = --rows;
            for (char i='A';i<=till;i++) 
            {
                for (char k='A';k<=space;k++)
                {
                    System.out.print(" ");
                }
                for (char j='A';j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
                space = --space;
            }
    }
}
