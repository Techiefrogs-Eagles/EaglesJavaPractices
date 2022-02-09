package practice.Interface;

public class interNor3 extends interNor2 implements inter4
{
    
    public void display41() {
        System.out.println("in inter4 display41");
    }

    void interN21() {
        System.out.println("in interNor2 display21");
    }
    
    public static void main(String[] args) {
        
        interNor3 intobj = new interNor3();
        //inter1 obj = new inter1();
        intobj.display11();
        intobj.display12();
        intobj.display21();
        intobj.display22();
        intobj.display31();
        intobj.display41();
        intobj.display51();
        intobj.display52();
        intobj.displayN11();
        intobj.displayN12();
        System.out.println("a = "+inter1.a);
        System.out.println("a = "+inter2.a);
        System.out.println("a = "+inter3.a);
        System.out.println("a = "+inter4.a);
        System.out.println("a = "+inter5.a);
        System.out.println("name = "+inter1.name);
        System.out.println("name = "+inter2.name);
        System.out.println("name = "+inter3.name);
        System.out.println("name = "+inter4.name);
        System.out.println("name = "+inter5.name);
    }
}
