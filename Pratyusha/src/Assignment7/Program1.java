package Assignment7;

public class Program1 {}

interface RegularPolygon {

    int getNumSides(int a);
    double getSideLength();

}

class EquilateralTriangle implements RegularPolygon {

    int var;

    public  int getNumSides(int a) {
         return a;
    }
    public double getSideLength() {
        return var;
    }

    EquilateralTriangle(int k){
        var = k;
    }
}
     class Square implements RegularPolygon {
         int var1;

         public int getNumSides(int a) {
             return a;
         }

         public double getSideLength() {
             return var1;
         }
         Square(int k) {
             
         }


    }

