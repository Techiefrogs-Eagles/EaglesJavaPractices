public class Encapsulationdemo {
    public static void main(String[] args) 
    {
        Encapsulation obj = new Encapsulation();
        obj.setA(80);
        System.out.println(obj.getA());
        obj.setB(false);
        System.out.println(obj.getB());
        obj.setC('C');
        System.out.println(obj.getC());
        obj.setD((byte) 40);
        System.out.println(obj.getD());
        obj.setF((short) 90);
        System.out.println(obj.getF());
        obj.setG(400);
        System.out.println(obj.getG());
        obj.setH((float) 600.1);
        System.out.println(obj.getH());
        obj.setI(700.1);
        System.out.println(obj.getI());

    }
    
}
