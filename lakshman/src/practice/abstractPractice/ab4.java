package practice.abstractPractice;

public class ab4 extends ab3
{
    void happy(){
        System.out.println("in happy method");
    }

    @Override
    void display3() {  }
    @Override
    void display4() {  }

    String google(String a){
        System.out.println(a);
        return a;
    }
    

    public static void main(String[] args) {
        ab4 obj4 = new ab4() {

            @Override
            void display3() {
                System.out.println("in ab4 display3");
                
            }

            @Override
            void display4() {
                System.out.println("in ab4 display4");
        
            }
            
        };
        obj4.happy();
        obj4.google("google");
        obj4.display();
        obj4.display1();
        obj4.display2();
        obj4.display3();
        obj4.display4();
        obj4.hello();
        obj4.hey();
        ab1.hai();
        obj4.number(20);

    }


   

    

    

    
    
}
