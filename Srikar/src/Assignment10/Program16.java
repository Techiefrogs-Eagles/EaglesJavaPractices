package Assignment10;

public class Program16 {
 public static void main(String[] args) {
        try{
            //int a[]=new int[-10];
            CloneNotSupportedException CN=new CloneNotSupportedException("ABC");
            //System.out.println(a);
            
            throw CN;
        }catch(CloneNotSupportedException CN)
        {

            System.out.println("CloneNotSupportexception");
        }

    }    
}
