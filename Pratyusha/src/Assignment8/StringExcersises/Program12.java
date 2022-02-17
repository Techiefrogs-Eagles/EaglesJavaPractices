package Assignment8.StringExcersises;

public class Program12 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Golden Retriver");
        System.out.println(str+" "+str.capacity());
        str.delete(0, str.length());
        System.out.println(str);
    }
    
}
