package BasicPractises.BasicPractises.Arrays;

public class ArrayDemo1 {
    
    public static void main(String[] args) {
    
    
    
    int array[];  //declaration of a variable
    
           array  = new int[5]; // length of the variable
           array[0] = 1;
           array[1] = 5;
           array[2] = 10;
           array[3] = 15;
           array[4] = 20;
    
           //To print all the values
         for(int i=0;i<5;i++){
    
        System.out.println(array[i]);
        }
        System.out.println();
        
    for (int i=0;i<array.length;i++){
        System.out.println(array[i]);
    }
    
    for(int i=array.length-1;i>=0;i--){//Reverse order
    System.out.println(array[i]);
    }
    
    
    
       }    
    }