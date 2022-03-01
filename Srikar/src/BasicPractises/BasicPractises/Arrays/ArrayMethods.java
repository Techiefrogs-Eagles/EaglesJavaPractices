package BasicPractises.BasicPractises.Arrays;

public class ArrayMethods {
    
    public static void main(String[] args) {
         // create an array
   int[] array = {12, 4, 5};

   // using for loop
   System.out.println("Using for Loop:");
   for(int i = 0; i < array.length; i++) {
     System.out.println(array[i]);
   }
     
  // using for each loop
        System.out.println("Using for-each Loop:");
        for(int a : array) {
          System.out.println(a);
        }
      }


}
