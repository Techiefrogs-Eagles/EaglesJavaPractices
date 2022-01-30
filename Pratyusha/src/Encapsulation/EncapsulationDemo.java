package Encapsulation;

public class EncapsulationDemo {
    
    private String name;
    private String  Idnum;
    private int age;
    private float percentage;
    private boolean z;
    private char x;
    private byte k;

    public boolean getZ() {
        return z;
    }

    public void setZ(boolean z) {
        this.z = z;
    }

    public char getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }

    public byte getK() {
        return k;
    }

    public void setK(byte k) {
        this.k = k;
    }

    public int getAge() {
        return age;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getIdnum() {
        return Idnum;
    }
     public String getname() {
         return name;
     }
     public void setAge ( int newAge ) {
         age = newAge;
     }
     public void setIdnum( String newIdnum) {
         Idnum = newIdnum;
     }
     public void setname( String newname) {
         name = newname;
     }

    }
   



