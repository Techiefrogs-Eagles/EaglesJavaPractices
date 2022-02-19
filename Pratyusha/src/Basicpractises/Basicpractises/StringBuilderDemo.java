package Basicpractises.Basicpractises;

public class StringBuilderDemo 
{
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        System.out.println(str+" "+str.capacity());
        str.append("Hello all, Welcome");
        System.out.println(str+" "+str.length()+" "+str.capacity());
        StringBuilder str1 = new StringBuilder(200);
        str1.append("Deep Sea");
        System.out.println(str1+"  "+str1.length()+" "+str1.capacity());
        str1.insert(8, " Nemo");
        System.out.println(str1+"  "+str1.length()+" "+str1.capacity());
        str1.replace(0, 4, "Shark ");
        System.out.println(str1+"  "+str1.length()+" "+str1.capacity());
        str1.delete(0, 5);
        System.out.println(str1+"  "+str1.length()+" "+str1.capacity());
        StringBuilder str2 = new StringBuilder("Whale");
        str2.reverse();
        System.out.println(str2);
        StringBuilder str3 = new StringBuilder();//0,16
        str3.append("Hello Jimmy");//10,70
        str3.append(70);
        System.out.println(str3);
        StringBuilderDemo sobj = new StringBuilderDemo();
        System.out.println(sobj);


    }
    
}
