package Practice.Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        StringBuffer sb2=new StringBuffer("qwe");
        System.out.println(sb.capacity()+" "+sb.append("kiran")+" "+sb);
        System.out.println(sb2.capacity());
        sb.deleteCharAt(2);
        System.out.println(sb);
        System.out.println(sb.reverse());
        StringBuilder sbs=new StringBuilder();
        

    }
}
