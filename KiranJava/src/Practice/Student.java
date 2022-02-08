package Practice;

public class Student {
    private int age;
    private double roll;
    private String name;
    public double getRoll() {
        return roll;
    }
    public void setRoll(double roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    
    //public int getAge(){
    //    System.out.println("user accessed the age value");
     //   return age;
       
    //}
    public void setAge( int age){

        this.age=age;
        System.out.println("user changed age value ");
    }
}
class test{
    public static void main(String[] args) {
        Student st=new Student();
        st.setAge(23);
        System.out.println(st.getAge());
        st.setName("kiran");
        System.out.println( st.getName());
    }
}
