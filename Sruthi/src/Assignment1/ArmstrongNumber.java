package Assignment1;
//the sum of cubes of each digits is equal to the number itself. e.g 371 = 3*3*3 + 7*7*7 + 1*1*1 
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 371, sum = 0, temp, r;
        temp = n;
        while (n>0)
        {
            r = n%10; // r is a remainder value // below are the 3 operations to chk if its a armstrong no or not
            sum = (r * r * r)+sum;
            n = n/10;
        }
        if (temp == sum)
        System.out.println(sum + " is an Armstrong Number");
        else
        System.out.println(sum + " is not an armstrong Number");
    }
}
