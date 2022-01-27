public class privateAccessModifier {
    private int k = 30;
     int l = 20;
    
     void display(){
        System.out.println(" In display method");
     }

     privateAccessModifier(){
         System.out.println("In private constructor");
     }

     public static void main(String[] args) {
         int i = 20;
         privateAccessModifier pObj = new privateAccessModifier();
         System.out.println(pObj.k+" "+pObj.l);
     }
    
}
