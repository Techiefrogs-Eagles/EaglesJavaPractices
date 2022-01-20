package Basicpractice;

public class Datatypedemo {
    static boolean b; // true or false //it takes the default value of false if we don't initialize
    static boolean b1 = true; 

    static char a = 200; // returns ascii value if number is assigned to a character
    static short s =23; // -32,768 to 32,767
    static int i = 192; // -2^31 to 2^31-1
    static long l = 45667l; // -2^63 to 2^63-1
    static float f = 495.97f;
    static double d = 6897.9876d;

  public static void main(String[] args) {
    
    System.out.println(b);  
    System.out.println(b1); 
    System.out.println(a);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);

  }  
}
