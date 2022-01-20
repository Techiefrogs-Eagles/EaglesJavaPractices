public class P3Swap {
    public static void main(String[] args) {

        int first = 1, second = 2;

        System.out.println("--Before swap-- " + "First number = " + first + " Second number = " + second );
     int temporary = first;
        first = second;
        second = temporary;

        System.out.println("--After swap-- " + "First number = " + first + " Second number = " + second);

    }
}