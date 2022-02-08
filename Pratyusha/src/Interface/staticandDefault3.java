package Interface;

    public class staticandDefault3 implements staticandDefaullt1,staticandDefault2,staticandDefault4{

        public void fan() {
            System.out.println("in fan method");
        }
    
        public void light() {
              System.out.println( "in light method");
        }
    
        public void normalmet1(){
            System.out.println( "in normet1 default method 1");
            staticandDefaullt1.super.normalmet1();
            staticandDefault4.super.normalmet1();
            
        }
    
    
        public static void main(String[] args) {
            staticandDefault3 objDefault3 = new staticandDefault3();
            objDefault3.fan();
            objDefault3.light();
            objDefault3.normalmet1();
            objDefault3.normalmet2();
            staticandDefaullt1.king();
            staticandDefault2.king2();
        }
        
    }
    

