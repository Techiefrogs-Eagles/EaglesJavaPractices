package practice;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println(str+"  "+str.capacity());
        str.append("hi all good morning have a nice");
        System.out.println(str+"  "+str.length()+"   "+str.capacity());
        StringBuffer str1 = new StringBuffer(200);
        str1.append("hai");
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        str1.insert(3, " welcome");
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        str1.replace(0,3, "bye, bye");
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        str1.delete(0, 9);
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        StringBuffer str2 = new StringBuffer("name");
        str2.reverse();
        System.out.println(str2);
        StringBuffer str3 = new StringBuffer();//0,16
        str3.append("hello all how are you");//21,34
        str3.ensureCapacity(35);//21,70
        str3.ensureCapacity(71);
        System.out.println(str3.capacity());




        
    }
}
