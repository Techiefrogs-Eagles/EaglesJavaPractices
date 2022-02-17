package Assignment8;

public class Program13 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("lakshman");
        System.out.println(str+"  "+str.capacity());
        str.setLength(0);
        System.out.println(str);
    }
}
