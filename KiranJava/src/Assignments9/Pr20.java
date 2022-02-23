package Assignments9;

public class Pr20 {
    public static void main(String[] args) 
    {
        int array[]={1,2,3,4,5};  
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
