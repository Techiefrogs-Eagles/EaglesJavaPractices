package src.Practice1;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer();
        str.append("hello good morning mokshitha");
        System.out.println(str+" "+str.length()+" "+str.capacity());

        StringBuffer str1=new StringBuffer(20);
        str1.append("Good evening");
        System.out.println(str1+" "+ str1.length()+" "+str1.capacity());
        str1.insert(0, "Hi ");
        System.out.println(str1+" "+str1.length()+" "+str1.capacity());
        str1.replace(0,3,"Hello ");
        System.out.println(str1+" "+str1.length()+" "+str1.capacity());
        str1.reverse();
        System.out.println(str1);
        StringBuffer str2=new StringBuffer();
        str2.ensureCapacity(30);
        str2.ensureCapacity(50);
        System.out.println(str2.capacity());


    }
}
