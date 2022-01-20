package Assignment1;

public class LCMof2Nos {
    public static void main(String[] args) {
        int x = 16, y = 18, gcd = 1;
        for(int i = 1; i <= x && i <= y; i++)
        {
            if (x%i == 0 && y%i ==0)
            gcd = i;
        }
        int lcm = (x * y) / gcd; // lcm formula a*b/GCD(a,b)
        System.out.println(" The lcm of " + x + " and " + y + " is " +lcm); 
    }
}
