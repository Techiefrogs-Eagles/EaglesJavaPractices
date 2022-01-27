package Assignment1;

public class armstrong {
    public static void main(String[] args) {
        
        
    int number=153, originalNumber, remainder, result=0 ;

    originalNumber = number;

    while (originalNumber != 0)
    {
        remainder = originalNumber % 10;
        System.out.println(remainder);
        
        result += Math.pow(remainder, 3);
        System.out.println(result);
        originalNumber /= 10;
    }

    if(result == number)
        System.out.println(number + " is an Armstrong number.");
    else
        System.out.println(number + " is not an Armstrong number.");
}
    
}
