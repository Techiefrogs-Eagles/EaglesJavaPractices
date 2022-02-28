package Practice.Exceptions;

public class NoLeaveException extends Exception {
    public NoLeaveException(String message, Throwable cause) {
        super(message, cause);
    }
    public NoLeaveException(String message){
        super(message);
    }
}
