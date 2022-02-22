package Assignment9Arrays;

public class Program12 
{
        public static void main(String[] args) 
        {
            int[] array = {5,10,15,20}; 
            int sum = 0;
            for (int i = 0; i < array.length; i++) 
            {
                 sum = sum+array[i];
            }
            System.out.println("sum of elements in array = "+sum);
        }
    }

