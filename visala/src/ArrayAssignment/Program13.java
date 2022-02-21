package src.ArrayAssignment;

public class Program13 {
    public static void main(String[] args) {
       
            char arr[]={'a','b','c'};
    
            System.out.println("This is normal elements");
            for (char i : arr)
             {
                
                System.out.print(i+" ");
    
             }
             System.out.println();
             System.out.println("This is right rotate elements");
             
             char k = arr[arr.length-1];
             for (int i = arr.length-1; i >0; i--) 
                              
            {
               arr[i] = arr[i-1];
            }
              arr[0] = k;
 
             for (char i : arr) 
           {
               System.out.print(i+" ");
           }
        }
    }
    

