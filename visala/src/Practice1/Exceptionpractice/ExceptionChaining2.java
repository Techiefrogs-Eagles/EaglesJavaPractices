package src.Practice1.Exceptionpractice;

public class ExceptionChaining2 {
    void method1() throws ArithmeticException{
        
            ArithmeticException AE = new ArithmeticException("Holiday");
            throw AE;
    }
    void method2() throws SchoolException{
        try {
            method1();
        }catch(ArithmeticException AE){
             throw new SchoolException("School closed",AE);
        }
    }
    public static void main(String[] args) throws SchoolException{
        ExceptionChaining2 obj = new ExceptionChaining2();
        obj.method2();
    }
}
