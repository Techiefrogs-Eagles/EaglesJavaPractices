package Assignment1;

public class LargestofThreeNo {
    public static void main(String[] args) {
        int a = 10,b = 10,c = 20;
        if(a>b && a>c)
        System.out.println("Largest No is " +a);        
        else if (b>a && b>c)
        System.out.println("Largest No is " +b);
        else if (c>a && c>b)
        System.out.println("Largest No is " +c);        
        else System.out.println("the given numbers are same");
        }
    }

