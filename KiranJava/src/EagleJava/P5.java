package EagleJava;import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {

        //char ch = 'g';
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = reader.next().charAt(0);
        reader.close();

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
