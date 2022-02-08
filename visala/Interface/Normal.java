package Interface;

public class Normal extends ABclass  {

    void age() {
        System.out.println("This is age method");

      
    }


    void name() {
        System.out.println("This is name method");
        
    }
    public static void main(String[] args) {
        Normal Nobj=new Normal();
        Nobj.display2();
        Nobj.num(20);
        Nobj.dispaly3();
        Nobj.display();
        Nobj.age();
        Nobj.name();
        System.out.println(Interface11.i);
        System.out.println(Interface11.s);
    

    }
    
}
