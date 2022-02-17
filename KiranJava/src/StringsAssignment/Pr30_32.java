package StringsAssignment;

public class Pr30_32 {
    public static void main(String[] args) {
        String str1 = "hello all good morning";
        System.out.println(str1.replaceAll("\\s", ","));
        System.out.println(str1.replaceAll("\\s", ""));
        System.out.println(str1.replace("go", "hi"));
    }
}
