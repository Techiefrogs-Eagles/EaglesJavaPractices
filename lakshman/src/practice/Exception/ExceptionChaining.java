package practice.Exception;

public class ExceptionChaining {



    public static void main(String[] args) throws Exception {
        getLeave();
    }

    private static void getLeave() throws StringIndexOutOfBoundsException {
        try {
            howIsTeamLead();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getCause());
            StringIndexOutOfBoundsException SI = new StringIndexOutOfBoundsException("leave is not granted");
            throw SI;
        }
    }

    private static void howIsTeamLead() throws ArrayIndexOutOfBoundsException{
        try {
            howIsManager();
        } catch (NumberFormatException e) {
            System.out.println(e.getCause());
            ArrayIndexOutOfBoundsException AI = new ArrayIndexOutOfBoundsException("Team lead is angry");
            AI.initCause(new ArrayIndexOutOfBoundsException("Team lead is angry"));
            throw AI;
        }
    }

    private static void howIsManager() throws NumberFormatException {
        try {
            howIsGirlFriendOfManager();
        } catch (ArithmeticException e) {
            System.out.println(e.getCause());
            NumberFormatException NF = new NumberFormatException("Manager is in bad mood");
            NF.initCause(new NumberFormatException("Manager is in bad mood"));
            throw NF;
            
        }
    }

    private static void howIsGirlFriendOfManager() throws ArithmeticException {
        ArithmeticException AE =  new ArithmeticException("Girl friend of manager is in bad mood");
        AE.initCause(new NumberFormatException("Girl friend of manager is in bad mood"));
        throw AE;
        
    }
}

