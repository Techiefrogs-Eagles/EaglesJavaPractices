package Assignments7;

public class Pr1a {
    
}
interface RegularPolygon{
    int getNumsides();
    void getSideLength();
   
   
}
class EquilateralTriangle implements RegularPolygon{
    EquilateralTriangle(int a){
         n=a;
    }
    int n;
    @Override
    public int getNumsides() {
        System.out.println("3");
        return 3;
    }

    @Override
    public void getSideLength() {
        System.out.println(n);
        
    }
   
    public static void main(String[] args) {
        EquilateralTriangle eq=new EquilateralTriangle(2);
        //RegularPolygon.n=4;
        eq.getSideLength();
        eq.getNumsides();
        System.out.println(eq.n);
    }
    
}
