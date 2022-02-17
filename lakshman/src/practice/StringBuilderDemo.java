package practice;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        System.out.println(str+"  "+str.capacity());
        str.append("hi all good morning have a nice");
        System.out.println(str+"  "+str.length()+"   "+str.capacity());
        StringBuilder str1 = new StringBuilder(200);
        str1.append("hai");
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        str1.insert(3, " welcome");
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        str1.replace(0,3, "bye, bye");
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        str1.delete(0, 9);
        System.out.println(str1+"     "+str1.length()+"    "+str1.capacity());
        StringBuilder str2 = new StringBuilder("name");
        str2.reverse();
        System.out.println(str2);
        StringBuilder str3 = new StringBuilder();//0,16
        str3.append("hello all how are you");//21,34
        str3.ensureCapacity(35);//21,70
        str3.ensureCapacity(71);
        System.out.println(str3.capacity());
    }
}
