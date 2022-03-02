package Practice.Exceptions;

public class ChainedEx {
    public static void main(String[] args) throws Exception {
        getLeave();
    }
    private static void getLeave() throws NoLeaveException{
        try {
            howIsTeam();
        } catch (ArithmeticException e) {
            throw new NoLeaveException("Leave not sanctioned.", e);
        }
    }
    private static void howIsTeam() throws ArithmeticException{
       
            throw new ArithmeticException("Example of chained Exception");
        
           
        }
    }

