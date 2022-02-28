package src.Practice1.Exceptionpractice;



public class SystemDefiend {
    public static void main(String[] args) throws Exception {
        Method1();
    }

    private static void Method1() throws StringIndexOutOfBoundsException {
        try {
            Method2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getCause());
            StringIndexOutOfBoundsException SI = new StringIndexOutOfBoundsException("cause");
            throw SI;
        }
    }

    private static void Method2() throws ArrayIndexOutOfBoundsException{
        try {
            Method3();
        } catch (NumberFormatException e) {
            System.out.println(e.getCause());
            ArrayIndexOutOfBoundsException AI = new ArrayIndexOutOfBoundsException();
            AI.initCause(new ArrayIndexOutOfBoundsException("sub cause 2"));
            throw AI;
        }
    }

    private static void Method3() throws NumberFormatException {
        try {
            Method4();
        } catch (ArithmeticException e) {
            System.out.println(e.getCause());
            NumberFormatException NF = new NumberFormatException();
            NF.initCause(new NumberFormatException("sub cause 1"));
            throw NF;
            
        }
    }

    private static void Method4() throws ArithmeticException {
        ArithmeticException AE =  new ArithmeticException();
        AE.initCause(new NumberFormatException("root cause"));
        throw AE;
        
    }
    
}
