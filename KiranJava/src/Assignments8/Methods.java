package Assignments8;

import java.util.Scanner;

public class Methods {
    
    public static void main(String[] args) {
        String str,a;
        String U="hi";
        Scanner st=new Scanner(System.in);
       String s=new String("hi");
        str=st.nextLine();
        a="hi";
        String Up= str.toUpperCase();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.equals(Up));
        if(str.contains(a)){
            System.out.println("contains hi");
        }
        st.close();
        //boolean t= (U==a);
        //System.out.println(t);
        System.out.println(U==a);
        System.out.println(U==s);
        System.out.println(s+" "+a+" "+U);
        
    }
}
