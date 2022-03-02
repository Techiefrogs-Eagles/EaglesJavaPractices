package src.ExceptionAssignment;

public class Program25 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();

        }finally{
            System.out.println("Hello");
        }
    }
    
}
