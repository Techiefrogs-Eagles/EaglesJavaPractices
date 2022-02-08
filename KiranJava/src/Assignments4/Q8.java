package Assignments4;

//import java.lang.reflect.Constructor;

public class Q8 { }
 class A{
    int i,j;
    A(int a,int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println(i+" "+j);
    }
}
class B extends A{
    int k;
    B(int a) {
        super(1, 2);
        k=a;
        
    }
    void show(){
        System.out.println("value of k is "+k);
    }
    public static void main(String[] args) {
        B bobj = new B(5);
        bobj.show();
    }

}

