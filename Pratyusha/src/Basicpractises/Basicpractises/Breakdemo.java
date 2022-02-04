package Basicpractises;
import java.util.Scanner;
public class Breakdemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = input.nextInt();
        input.close();
        switch(num){
            case 1: System.out.println("One");
                       break;
            case 2:System.out.println("Two");
                       break;
            case 3: System.out.println("Three");
                       break;
            case 4: System.out.println("Four");
                       break;
            case 5: System.out.println("Five");
                       break; 
              default : System.out.println("Other number");
                       break;
        }
    }
}
