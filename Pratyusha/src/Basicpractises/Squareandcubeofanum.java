package Basicpractises;

/*
    Accept Num print square and cube ?
    Enter Number : 5
    Square : 25
    Cube : 125
    */
    import java.util.Scanner;
    public class Squareandcubeofanum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number:");
            int num = input.nextInt();
            int sqr = num*num;
            int cube=num*num*num;
            input.close();
            System.out.println("Square:"+sqr);
            System.out.println("Cube:"+cube);
            
        }
    }

