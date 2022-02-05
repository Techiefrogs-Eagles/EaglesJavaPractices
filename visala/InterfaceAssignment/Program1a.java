package InterfaceAssignment;

public class Program1a {
    
}
 interface regularpolygon

{
    int  getNumSide(int a);
    int getSideLength();
    

}
class  EqualeterTrigngle  implements regularpolygon{
int var;
    
    public int getNumSide(int a){

    
        return a;
    }

    
    public int getSideLength() {
        
        return var;
    }
    EqualeterTrigngle (int k)
     {
         var=k;
         
     }
    




class  Square  implements regularpolygon{

  int  var1;
    public int getNumSide(int b) {
    
        return b;
    }

    
    public int getSideLength() {
        
        return var1;
    }
    Square(int k)
    {
var1=k;
    }
    public static void main(String[] args) {
    }
}
}
