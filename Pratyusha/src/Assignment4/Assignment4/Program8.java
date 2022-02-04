package Assignment4;

 public class Program8 { }

class A {
    int i;
    int j;
   
    A(int a,int b) {
        i = a;
        j = b;
    }
    void show() {
       
        System.out.println("The value of i = "+i);
        System.out.println("The value of j ="+j);
    }

}


class B extends A {

 int k;

 B(int c){
     super(10,20);
     k = c;
 }
   void show()
   {
       System.out.println("The value of k = "+k);
   }

   public static void main(String[] args) {
       B cobj = new B(50);
       cobj.show();
   }


}
