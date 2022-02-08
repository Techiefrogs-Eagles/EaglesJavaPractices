package Practice;



public class Encapsulation {
    private int i=20;
    private String name="kk";
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Encapsulation enc=new Encapsulation();
        //Encapsulation enc1=new Encapsulation(2);
        System.out.println(enc.i);
    }
    class example
    {
        
    }
   
}
