package Assignment9;

public class Program41 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,12,23,34};
        int b[] = {6,7,8,9,10,11};

        int length = a.length;
        int length1 = b.length;
        int temp = 0;

        int c[] = new int[length+length1];
        
        for (int i = 0; i < length; i++) 
        {
            c[temp] = a[i];
            temp++;
        }

        for (int i = 0; i < length1; i++) 
        {
            c[temp] = b[i];
            temp++;
        }

        for (int i : c) 
        {
            System.out.print(i+" ");
        }
    }
}
