package Assignment9Arrays;

public class Program41 
{
    public static void main(String[] args) 
    {
        char c[] = {'A','B','C','D'};
        char c1[] = {'E','F','G','H','I'};
       // int a = c.length;
        //int b = c1.length;

        char[] c2 = new char[c.length+c1.length];
         char temp = 0;
        
        for (int i = 0; i < c.length; i++) 
        {
              c2[temp] = c[i];
              temp++;     
        }
        for(int ch = 0; ch < c1.length; ch++)
        {
            c2[temp] = c1[ch];
              temp++;  
        }
    
        for (char c3 : c2) 
        {
            System.out.print(c3+" ");
        }
        
    }
    
}
