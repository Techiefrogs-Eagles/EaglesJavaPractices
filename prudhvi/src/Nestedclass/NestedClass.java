package Nestedclass;

public class NestedClass {
    int i = 10;
    String name = "john";

    void display(){
        System.out.println("in dispaly");
    }

    NestedClass(){
        System.out.println("in constructor");

    }

    class Myinnerclass{
         int k = 30;

         void innerdisplay(){
             System.out.println("in inner display");

         }
         Myinnerclass(){
             System.out.println(" in inner constructor");
         }

    }
    
    public static void main(String[] args) {

        NestedClass outerobj = new NestedClass();
        Myinnerclass innerobj = outerobj.new Myinnerclass();
        innerobj.innerdisplay();

        
    
        
    }

    
    
    

    
}
