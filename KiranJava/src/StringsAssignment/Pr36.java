package StringsAssignment;

public class Pr36 {
    public static void main(String[] args) {
        String str = "welcome";
        int length = str.length();
        String ref = "";
        for (int i = length; i >=1; i--) {
            ref = ref +str.charAt(i-1);
        }
        System.out.println(ref);
    }
}
