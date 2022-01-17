package Assignment1;

public class alphaORvowel {
    public static void main(String[] args) {
        char c = 'h';
            switch(c)
            {
                case 'a','e','i','o','u':
                System.out.println("The given alphabet is a vowel");
                break;
                default :
                System.out.println("The given alphabet is a consonent");
            }
    }
}
