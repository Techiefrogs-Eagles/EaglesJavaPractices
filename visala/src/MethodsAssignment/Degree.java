package src.MethodsAssignment;



public class Degree
{
void getDegree()
{
    System.out.println("I got a degree");

}
/*public static void main(String[] args) {
    Degree Dobj=new Degree();
        Dobj.getDegree();
    
}
*/
}



class Undergraduate extends Degree{
    void getDegree(){
        System.out.println("I am an Undergraduate");
    
    }
   /* public static void main(String[] args) {
        Undergraduate Uobj=new Undergraduate();
        Uobj.getDegree();
    }*/

}


class Postgraduate extends Degree{
    void getDegree()
    {
        System.out.println("I am Postgraduate");
        
    }
    public static void main(String[] args) {
        Postgraduate Pobj=new Postgraduate();
        Degree Dobj=new Degree();
        Undergraduate Uobj=new Undergraduate();
        Dobj.getDegree();
        Pobj.getDegree();
        Uobj.getDegree();
    }
}