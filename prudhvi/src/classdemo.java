public class classdemo {
    int i =5;
    String s = "hi";
    static int j =50;
    void display(){

        System.out.println( " in the display");
    }
    public static void main(String[] args) {
        
        int a = 9;
        classdemo classobj = new classdemo();

        classobj.i = 10;
        classobj.s="world";
        classobj.j=1000;
        classobj.display();

        classdemo classobj1 = new classdemo();

        classobj1.i= 4;
        classobj1.s=" my world";
        classobj1.j=100000;
        classobj.display();

        System.out.println(classobj.i+"  "+classobj.s);
        System.out.println(classobj1.i+" "+classobj1.s+" "+j);
    }
    
}
