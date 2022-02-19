package src.StringAssignment;

public class Program13 {
    public static void main(String[] args) {
        StringBuffer str1=new StringBuffer("Hello");
        System.out.println(str1+" "+str1.capacity());
        str1.setLength(0);
        System.out.println(str1);
                }
    
}
