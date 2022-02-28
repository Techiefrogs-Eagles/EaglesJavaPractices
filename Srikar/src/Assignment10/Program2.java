package Assignment10;

public class Program2 {
public static void main(String[] args) {
    
    int a = 10;
    int b = 0;
    System.out.println("Sum of two Interger numbers");
     try {
       System.out.println(a/b);
    } catch(ArithmeticException e){  
        System.out.println(e.getMessage());  
    }    
    catch(ArrayIndexOutOfBoundsException e){  
        System.out.println(e.getMessage());  
    }    
    catch(Exception e){  
        System.out.println(e.getMessage());  
}
}
}
    

