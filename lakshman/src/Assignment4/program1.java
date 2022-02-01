package Assignment4;

class program1 {}

class parentclass
{
    void parentMethod(){
        System.out.println("This is parent class");
    } 
    
    public static void main(String[] args) {
        parentclass pobj = new parentclass();
        pobj.parentMethod();
    }
}


class childclass extends parentclass
{
    void childmethod(){
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        childclass cobj = new childclass();
        cobj.childmethod();
        cobj.parentMethod();
    }
}
