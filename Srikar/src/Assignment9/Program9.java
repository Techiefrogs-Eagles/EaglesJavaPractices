package Assignment9;

public class Program9 {
    public static void main(String[] args) {
        int[] array = {0,1,20,54,3,5,6,7,2,3,4,5,58,78,98,54,12,007 };   
        int ref = 0;  
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i] > ref)  
            ref = array[i];  
        }  
        System.out.println("Largest number = "+ref);  
    }
}