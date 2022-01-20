public class constructordemo {
    int t;
    String s;
    constructordemo(){
         t=10;
         s ="hello";
         System.out.println( "in the constructor");
    }
    constructordemo(int k, String str){
        t = k;
        s = str;
        System.out.println("in the param constructor");

    }
    void display(){
        System.out.println(t+" "+s);
    }
    public static void main(String[] args) {
        constructordemo cdemo = new constructordemo();
        cdemo.display();
        //System.out.println(cdemo.t+" "+cdemo.s);

        constructordemo cdemo1 = new constructordemo();
        cdemo1.display();
        //System.out.println(cdemo1.t+" "+cdemo1.s);

        constructordemo cdemo2 = new constructordemo(60,"hi");
        cdemo2.display();
        //System.out.println(cdemo2.t+" "+cdemo2.s);
        int k =90;
        String str = " world";

        constructordemo cdemo3 = new constructordemo(k,str);
        cdemo3.display();
       // System.out.println(cdemo3.t+" "+cdemo3.s);

    }
    
}
