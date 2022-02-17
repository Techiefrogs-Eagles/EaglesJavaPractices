package Assignment8;

public class Program14 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("lakshman");
        System.out.println(str+"  "+str.capacity());
        str = new StringBuffer();
        System.out.println(str);
    }
}
