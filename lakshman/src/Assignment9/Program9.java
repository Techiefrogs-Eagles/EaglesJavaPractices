package Assignment9;

public class Program9 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};   
        int ref = 0;  
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i] > ref)  
            ref = array[i];  
        }  
        System.out.println("Largest number = "+ref);  
    }
}
