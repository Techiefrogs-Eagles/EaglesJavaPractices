abstract public class ab2 extends ab1
 {
    void display()
    {
        System.out.println("In ab2 Display Method");
    }
    abstract  void display1();

    abstract void display2();

    public static void main(String[] args) {
        
        ab2 obj2 = new ab2() 
        {
            void display1() 
            {
                System.out.println("in ab2 display1");
            }

            void display2() 
            {
                System.out.println("in ab2 display2");
            }
        };
        obj2.display();
    }
    
}
