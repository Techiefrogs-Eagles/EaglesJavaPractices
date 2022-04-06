package src.Practice1.Practice;

    public class bitandlogical {
    public static void main(String[] args) throws Exception {

        int a=6;
        int b=9;
        System.out.println(a<b | b>a); //false | true = true
        System.out.println(a<b & b<a); //true & false = false //check both conditions

        System.out.println(a<b && b<a); //true && false = true //check first condition
        System.out.println(a<b || b<a);
    }
}
