package src.Practice1;

public class StringBulderDemo {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        str.append("hello good morning mokshitha");
        System.out.println(str+" "+str.length()+" "+str.capacity());

        StringBuilder str1=new StringBuilder(20);
        str1.append("Good evening");
        System.out.println(str1+" "+ str1.length()+" "+str1.capacity());
        str1.insert(0, "Hi ");
        System.out.println(str1+" "+str1.length()+" "+str1.capacity());
        str1.replace(0,3,"Hello ");
        System.out.println(str1+" "+str1.length()+" "+str1.capacity());
        str1.reverse();
        System.out.println(str1);
        StringBuilder str2=new StringBuilder();
        str2.ensureCapacity(30);
        str2.ensureCapacity(50);
        System.out.println(str2.capacity());
    }
}
