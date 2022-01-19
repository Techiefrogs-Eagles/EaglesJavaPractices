import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=validate(sc);
        System.out.println("value is "+num);
        sc.close();
    }

static int validate(Scanner sc)
{
    int num;
    do{
        System.out.println("enter positive num");
        while(!sc.hasNextInt())
        {
            System.out.println("not positive");
            sc.next();
        }
        num=sc.nextInt();

    }while(num<=0);
    return num;
}
}
