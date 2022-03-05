package Assignments10;

public class Pr25 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();

        }finally{
            System.out.println("Hello");
        }
    }
}
