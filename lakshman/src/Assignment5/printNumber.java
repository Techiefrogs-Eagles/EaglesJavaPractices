package Assignment5;

public class printNumber 
{
    void printn(byte a){ System.out.println("in byte"); } 
    void printn(short a){ System.out.println("in short"); }
    void printn(int a){ System.out.println("in int"); }
    void printn(long a){ System.out.println("in long"); }
    void printn(Boolean a){ System.out.println("in boolean"); }
    void printn(char a){ System.out.println("in char"); }
    void printn(float a){ System.out.println("in float"); }
    void printn(double a){ System.out.println("in double"); }
    void printn(String a){ System.out.println("in string"); }
    
    public static void main(String[] args) {
        printNumber obj = new printNumber();
        obj.printn((byte) 1);
        obj.printn((short) 1);
        obj.printn(1);
        obj.printn((long) 1);
        obj.printn(true);
        obj.printn('A');
        obj.printn(1f);
        obj.printn((double) 1);
        obj.printn("hello");

    }
}
