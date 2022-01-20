package Basicpractice;

/**
 * Switchdemo
 */
public class Switchdemo {
    static int K;

    public static void main(String[] args) {
        
        int day = 3;

       // switch (K) {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;   
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;   
            default:
                System.out.println("Doesn't Match");
                break;
        }
       /* System.out.println("After switch");

        char ch = 'K';
        switch (ch) {
            case 10: 
                    System.out.println("10");
                    break;
            case 75:
                    System.out.println("K"); // case 75 will get executed as the ASCII value of 75 is K
                    break;

        } */

    }
}