package src.StringAssignment;

public class Program12 {
    
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("Hello");
        System.out.println(str);
        str.delete(0, 5);
        System.out.println(str);

    }
}
