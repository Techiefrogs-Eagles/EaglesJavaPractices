package practice.abstractPractice;

abstract public class ab1 
{
    int k = 10;
    String name = "lakshman";

    abstract void display();

    void hello(){
        System.out.println("ab1 instance");
    }

    static void hai(){
        System.out.println("ab1 static");
    }

    final void hey(){
        System.out.println("ab1 final");
    }

    int number(int a){
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        ab1 obj1 = new ab1()
        {
            void display()
            {
                System.out.println("in ab1 display method");
            }

           // obj1.display();
        };

        System.out.println(obj1.k);
        System.out.println(obj1.name); 
        obj1.hello();
        obj1.hey();
        ab1.hai();
        obj1.number(20);
        //obj1.display();
    }
}
