package Encapsulation;

public class EncapsulationDemo {
    
    private String name;
    private String  Idnum;
    private int age;
    private float percentage;

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

