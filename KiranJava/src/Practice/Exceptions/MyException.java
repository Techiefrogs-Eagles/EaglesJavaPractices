package Practice.Exceptions;

class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
  
// A Class that uses above MyException
