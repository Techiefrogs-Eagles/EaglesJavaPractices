package AccessModifiers;

public class PrivateMod {
    public static void main(String[] args) {
    }
}
    class A{  
        public static void main(String[] args) {
        }
        int data=40;  
        void msg()
        {System.out.println("Hello java");}  
    }
        class Simple {
     public static void main(String[] args) {
         
           A obj=new A();  
           System.out.println(obj.data);//Compile Time Error  
           obj.msg();//Compile Time Error  
            
        }
    }
