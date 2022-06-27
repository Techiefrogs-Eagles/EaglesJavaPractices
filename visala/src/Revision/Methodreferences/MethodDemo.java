package src.Revision.Methodreferences;

interface myinterface {
    void inter(int i, int j);
}

class reference {
    public static int add(int a, int b) {
        System.out.println(a + b);
        return a;
    }

    void normal(int a, int b) {
        System.out.println("This is normal method");
    }

    reference(int a, int b) {
        System.out.println("This is constructor");
    }
}

public class MethodDemo {

    public static void main(String[] args) {

        /*
         * myinterface fun = reference::add;
         * fun.inter(3, 4);
         * reference ren = new reference();
         * myinterface iobj = ren::normal;
         * iobj.inter(3, 4);
         * 
         */

        myinterface iobj2 = reference::new;
        iobj2.inter(10, 4);

    }
}
