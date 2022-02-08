package Assignments4;
class counter{
    int i;
   void increment(int a){
     i=a+1;
    System.out.println("i = "+i);
    }
}
public class Q7 extends counter {
    public static void main(String[] args) {
        Q7 count=new Q7();
        count.increment(2);
    }
}
