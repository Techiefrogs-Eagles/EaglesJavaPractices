package Assignment1;

public class factorial 
{
    public static void main(String[] args) 
    {
        int input=3;
            int j=1;
            for(int i=1;i<=input;i++)
            {
                j=j*i;
            }
            System.out.println(j);
            
    }

        //find the factorial of the number using while loop
        static void code8_2()
        {
            int input=5;
            int i=1;
            int j=1;
            while(i<=input)
            {
                j=j*i;
                i++;
            }
            System.out.println(j);
        }
    
}
