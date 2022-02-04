package Assignments5;

public class Q2 {
    void method(int a,char b){
        System.out.println("integer "+a +" character "+b);
    }
    void method(char b,int a){
        System.out.println("integer "+a +" character "+b);
    }
    public static void main(String[] args) {
        Q2 sc=new Q2();
        sc.method(12,'n');
        sc.method('v', 23);

    }
}
