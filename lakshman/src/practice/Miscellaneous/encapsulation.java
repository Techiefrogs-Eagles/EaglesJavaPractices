package practice.Miscellaneous;

public class encapsulation 
{
    private int a = 10;
    private boolean b = true;
    private char c = 'A';
    private byte d = 20;
    private short f = 30;
    private long g = 40;
    private float h = 50.1f;
    private double i = 60.1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean getB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public byte getD() {
        return d;
    }

    public void setD(byte d) {
        this.d = d;
    }

    public short getF() {
        return f;
    }

    public void setF(short f) {
        this.f = f;
    }

    public long getG() {
        return g;
    }

    public void setG(long g) {
        this.g = g;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }



    public static void main(String[] args) 
    {
        encapsulation obj = new encapsulation();
        System.out.println(obj.a);
    }
}
