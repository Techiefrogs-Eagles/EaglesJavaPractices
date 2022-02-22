package Assignment9;

public class Program20 
{
    public static void main(String[] args) 
    {
        int array[]={2,4,6,8,10,12,14,16,18,20,22,1,3,5,7,9,11,13,15,17,19,21};  
        System.out.println("odd Numbers are");  
        for(int i=0;i<array.length;i++)
        {  
            if(array[i]%2!=0)
            {  
                System.out.print(array[i]+" ");  
            }  
        }
        System.out.println();  
        System.out.println("even Numbers are");  
        for(int i=0;i<array.length;i++)
        {  
            if(array[i]%2==0)
            {  
            System.out.print(array[i]+" ");  
            }
        }
    }
}