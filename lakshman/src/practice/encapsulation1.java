package practice;

public class encapsulation1 
{
    public static void main(String[] args) 
    {
        encapsulation obj = new encapsulation();
        obj.setA(100);
        System.out.println(obj.getA());
        obj.setB(false);
        System.out.println(obj.getB());
        obj.setC('B');
        System.out.println(obj.getC());
        obj.setD((byte) 50);
        System.out.println(obj.getD());
        obj.setF((short) 80);
        System.out.println(obj.getF());
        obj.setG(400);
        System.out.println(obj.getG());
        obj.setH((float) 600.1);
        System.out.println(obj.getH());
        obj.setI(700.1);
        System.out.println(obj.getI());

    }
}
