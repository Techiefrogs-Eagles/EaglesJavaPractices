package Assignment2;

public class program1 
{
    public static void main(String[] args) 
    {
        int star = 1;
            for (int i = 1; i <= 5; i++) 
            {
                for (int j = 5; j >= 1; j--) 
                {
                    if (j==star)
                    {
                        System.out.print("*");
                        star = star+1;
                        continue;
                    }
                    System.out.print(j);    
                }
                System.out.println();
            }
    }
}
