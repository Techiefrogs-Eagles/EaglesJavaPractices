package Assignment1;
// factorial of !4 = 4*3*2*1
public class Factorial {
    public static void main(String[] args) {
        int fact = 1, n = 4, i = 1;
        while (i <= n)
            {
          fact = fact * i;
            i++;
            }
        System.out.println("Factorial of number 4 is " +fact);
        }

    }
    

