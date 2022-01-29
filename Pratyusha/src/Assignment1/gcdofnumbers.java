package Assignment1;

public class gcdofnumbers {
    public static void main(String[] args) {
        int Num1 = 15, Num2 = 30, Temp, GCD=0;
        while(Num2 !=0)
        {
            Temp = Num2;
            Num2 = Num1 % Num2;
            Num1 = Temp;
        }
        GCD = Num1;
        System.out.println("\n GCD = " + GCD);
    }
}
