package Practice.Strings;

public class StringBufferDemo {
   
}
class St{
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("a");
        str.append("str");
        System.out.println(str.capacity());
        str.ensureCapacity(127);
        System.out.println(str.capacity());
        str.append("jhgfdsa", 1,5);
        System.out.println(str);
        StringBuffer str1 = new StringBuffer(200);
        str1.append("12345");
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        boolean n=str.equals(str1);
        System.out.println(n);
        System.out.println(str1.replace(3, 4, "re"));
        System.out.println(str1.reverse());
        //System.out.println(str1.replace(3, 4, "re"));
        System.out.println(str1.toString());
    }
}
