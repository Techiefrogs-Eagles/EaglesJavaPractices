package Assignment4;

public class Program1 { }

class parent {
    void parentmethod() {
    System.out.println("This is Parent class");
}

public static void main(String[] args) {
    parent pobj = new parent();
    pobj.parentmethod();
}
}

class child extends parent {
    void childmethod() {
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        child cobj = new child();
        cobj.childmethod();
    }
}

