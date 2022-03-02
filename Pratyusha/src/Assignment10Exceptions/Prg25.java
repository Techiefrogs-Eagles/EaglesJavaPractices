package Assignment10Exceptions;

public class Prg25 
{
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();

        }finally{
            System.out.println("Hello");
        }
    }
}
