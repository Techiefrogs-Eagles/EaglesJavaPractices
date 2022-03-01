package Practice.TypeCasting;

public class TypePromotion {
    public static void main(String[] args) {
        byte b=9;
        short s=78;
        short sh= (short) (b+s);
        short ss=(short) (b-s);
        int i=b+s;
        double d=233.44;
        int in=(int) (d+s);
        System.out.println(in);
        short sa=(short) (s*2);
    }
}
