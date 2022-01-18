package Assignment1;
// Greatest Common Divisor
public class GCDof2Nos {
    public static void main(String[] args) {
        int x = 24, y = 12, gcd = 1;
        for (int i = 1; i <= x && i <= y; i++)
        {
            if(x%i == 0 && y%i ==0)
            gcd = i;
        }
        System.out.println("GCD of " + x + " and " + y + " is " + gcd);
          }
}

