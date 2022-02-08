package Assignment4;

class program2 {}

class parentclass1
{
    private void parentMethod(){
        System.out.println("This is parent class");
    } 
    
    public static void main(String[] args) {
        parentclass1 pobj = new parentclass1();
        pobj.parentMethod();
    }
}


class childclass1 extends parentclass1
{
    void childmethod(){
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        childclass1 cobj = new childclass1();
        cobj.childmethod();
    }
}
