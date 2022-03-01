package Assignment10;

public class Program10 {

    public static void main(String[] args) {
        int a=10;
        int b=0;

        try{  
            
           int c = 100/0;  
        }catch(ArithmeticException Ae){System.out.println(Ae);}  
        //rest code of the program   
        System.out.println("Divides by zero");  
       }  
}
