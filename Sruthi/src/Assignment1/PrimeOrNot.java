package Assignment1;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 31;
        boolean flag = false;
        for(int i = 2; i <= num/2; i++) // 0 & 1 is not prime number so we are initializing it as 2
        {
            if(num % i == 0)
            {
            flag = true;
            break;
        }
    }

                if(!flag)
                System.out.println(num + " is a Prime No");
                else
                System.out.println(num + " is not a Prime No");

            }
    }

