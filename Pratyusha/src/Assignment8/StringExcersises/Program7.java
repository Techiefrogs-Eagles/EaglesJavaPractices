package Assignment8.StringExcersises;

public class Program7 {
    
    public static void main(String[] args) {
        String str1 = "hello Nemo";
        String str2 =  new String("Hello Nemo");
        String str3 = new String("Hello Nemo");

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
    }
}
