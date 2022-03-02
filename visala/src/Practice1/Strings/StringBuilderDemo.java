package src.Practice1.Strings;

public class StringBuilderDemo {
  
    int n=36;
    String name="  siva";
    public String toString() {
        
        return n+name;
    }
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

        StringBuilderDemo obj=new StringBuilderDemo();
        System.out.println(obj.toString());
        System.out.println(obj);
            
        }
       
    }

