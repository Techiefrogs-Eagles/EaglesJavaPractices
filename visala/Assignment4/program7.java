package Assignment4;

public class program7 {
    
}

class Counter{
int i;
 
    void increment(int i)
{
     System.out.println("i="+i);

}
}

class counter1 extends Counter{
    public static void main(String[] args) {
        counter1 cobj1=new counter1();
        cobj1.increment(3);
    }

}