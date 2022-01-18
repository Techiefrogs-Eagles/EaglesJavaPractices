package Assignment1;

public class VowelOrConsonants {
    public static void main(String[] args) {
       char ch = 'c'; // o/p as consonant
        //char ch = 'i'; // o/p as vowel

        switch(ch) {
            case 'a','e','i','o','u' -> System.out.println(ch +  "  is  a Vowel");                   
            default -> System.out.println(ch + " is a Consonant");
        };
    }
    
}
