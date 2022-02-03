package Assignments5;
class Degree{
    public void getDegree(){
      System.out.println("I got a degree");
    }
  }
  
  class Undergraduate extends Degree{
    public void getDegree(){
      System.out.println("I am an Undergraduate");
    }
  }
  
  class Postgraduate extends Degree{
    public void getDegree(){
      System.out.println("I am a Postgraduate");
    }
  }
public class Q5 {
    public static void main(String[] args){
        Undergraduate a = new Undergraduate();
        Postgraduate b = new Postgraduate();
        Degree d=new Degree();
        a.getDegree();
        b.getDegree();
        d.getDegree();
      }
}
