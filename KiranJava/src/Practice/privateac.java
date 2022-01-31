//package Practice;
public class privateac {
    public static void main(String[] args) {
        A obj=new A();
        int b=obj.c;
        System.out.println(b);
        obj.name();
    }
}
class A{
    int c=3;
    protected void name() {
        System.out.println("hii");
    }
    public void msg() {
    }
}
