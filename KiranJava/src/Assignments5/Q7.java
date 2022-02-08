package Assignments5;

public class Q7 {
    public static void main(String[] args) {
        J sub=new J();    
        sub.i=5;
        sub.j=9;
        sub.PrintNum();
    }
}
class I{
    int i;
    void PrintNum(){
        System.out.println(i);
    }
}
class J extends I{
    int j;
    void PrintNum(){
        System.out.println(j);
    }
}