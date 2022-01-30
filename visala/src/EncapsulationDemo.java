public class EncapsulationDemo {
   
    private int i=1;
   private String s="tarak";
  private  float f=  1234.5f;
  private  boolean b= true;


    public int getI() {
    return i;
}


public void setI(int i) {
    this.i = i;
}


public String getS() {
    return s;
}


public void setS(String s) {
    this.s = s;
}


public float getF() {
    return f;
}


public void setF(float f) {
    this.f = f;
}


public boolean getB() {
    return b;
}


public void setB(boolean b) {
    this.b = b;
}


    public static void main(String[] args) {
        EncapsulationDemo eobj=new EncapsulationDemo();
        System.out.println(eobj.i);
    
        
        
        
    }
}
