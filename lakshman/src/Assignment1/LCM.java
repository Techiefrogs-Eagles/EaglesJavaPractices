package Assignment1;

public class LCM {
    public static void main(String[] args) {
        int a=15;
            int b=25;
            int gcd=1;
            for(int i=1;i<=a && i<=b;i++)
            {
                if (a%i==0 && b%i==0)
                gcd=i;
            }
            int lcm=(a*b)/gcd;
            System.out.println("L.C.M of given numbers is "+lcm);
    }
}
