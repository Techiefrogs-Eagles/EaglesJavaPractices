package Practice.Exceptions;

import java.io.IOException;
import java.lang.ArithmeticException;

public class MyChainedException {
    public static void main(String[] args) {
        try {
            try {
                throw new ArithmeticException("Top Level Exception.")
                  .initCause(new IOException("IO cause."));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch(ArithmeticException ae) {
            System.out.println("Caught : " + ae);
            System.out.println("Actual cause: "+ ae.getCause());
        }
    }   
}
