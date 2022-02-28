package Practice;

public class CustomException extends RuntimeException {
  CustomException(String msg){
      super(msg);
  }
}
 class DriverClass{
public static void main(String[] args) {
    int age=1;
    try {
        if(age>18)
        System.out.println("Eligible");
        else
         throw new CustomException("Not Eligible");
    } catch (CustomException e) {
        //TODO: handle exception
        System.out.println(e.getMessage());
    }
}
}
