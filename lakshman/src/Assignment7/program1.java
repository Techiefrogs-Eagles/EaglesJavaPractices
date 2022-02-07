package Assignment7;

public class program1 {}

interface RegularPolygon
{
    int getNumSides(int a);
    double getSideLength();
}

class EquilateralTriangle implements RegularPolygon
{
    int var;

    public int getNumSides(int a){
        return a;
    }

    public double getSideLength(){
        return var;
    }

    EquilateralTriangle(int k){
        var = k;
    }
}

class square implements RegularPolygon{
    int var1;

    public int getNumSides(int a){
        return a;
    }

    public double getSideLength(){
        return var1;
    }

    square(int k){
        var1 = k;
    }
}
