import javax.lang.model.util.ElementScanner14;

/**
 * alphabetornot
 */
public class alphabetornot {
 
    public static void main(String[] args) {
        
        char c='M';
      if((c>='a' && c<='z') || (c>='A' && c<='z'))
      {
          System.out.println(c+ " is an alphabet");
        
      }
      else{
          System.out.println(c+" is not an alphabet");
      }


    }
}

