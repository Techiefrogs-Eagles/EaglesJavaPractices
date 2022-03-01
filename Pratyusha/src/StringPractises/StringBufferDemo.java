package StringPractises;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println(str+" "+str.capacity());
        str.append("Hello all, Welcome");
        System.out.println(str+" "+str.length()+" "+str.capacity());
        StringBuffer str1 = new StringBuffer(200);
        str1.append("Deep Sea");
        System.out.println(str1+"  "+str1.length()+" "+str1.capacity());
        str1.insert(8, " Nemo");
        System.out.println(str1+"  "+str1.length()+" "+str1.capacity());
        str1.replace(0, 4, "Shark ");
        System.out.println(str1+"  "+str1.length()+" "+str1.capacity());
        str1.delete(0, 5);
        System.out.println(str1+"  "+str1.length()+" "+str1.capacity());
        StringBuffer str2 = new StringBuffer("Whale");
        str2.reverse();
        System.out.println(str2);
        StringBuffer str3 = new StringBuffer();//0,16
        str3.append("Hello Jimmy");//10,70
        str3.append(70);
        System.out.println(str3);




    }
}
