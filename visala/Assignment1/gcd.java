package Assignment1;

public class gcd {
    public static void main(String[] args) {
        int n1 = 9, n2 = 45;
    
        while(n1 != n2) {
        
          if(n1 > n2) {
            n1 =n1-n2;
          }
        
          else {
            n2=n2-n1;
          }
        }
  
        System.out.println("GCD: " + n1);
    }

    
    
}
