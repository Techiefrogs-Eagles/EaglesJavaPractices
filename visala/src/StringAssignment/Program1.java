package src.StringAssignment;

public class Program1 {
    public static void main(String[] args) {
        int vowel = 0;
        int consonent = 0;
        int digit = 0;
        int space = 0;
        String str = "Hello good moring 183474/.'',";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                space++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digit++;
            } else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == ':'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonent++;

            }

        }
        System.out.println("number of spaces  " + space);
        System.out.println("number of digits  " + digit);
        System.out.println("number of vowels  " + vowel);
        System.out.println("number of consonents  " + consonent);
    }
}
