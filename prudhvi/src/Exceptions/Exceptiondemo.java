package Exceptions;

public class Exceptiondemo {
    public static void main(String[] args) {
        
      
      try {
          int arr[]={1,2,5,7};
          System.out.println(arr[10]);
      } catch (ArrayIndexOutOfBoundsException ex) {
          System.out.println(ex);
      }
      try{
          int data =100/0;
      }catch(ArithmeticException ex){
          System.out.println(ex);
      }
      System.out.println("rest of the code"); 
     
    }
    
}
