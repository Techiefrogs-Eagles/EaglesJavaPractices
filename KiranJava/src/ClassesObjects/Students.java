package ClassesObjects;

public class Students {
    public static void main(String[] args) {
        Student S=new Student();
        S.name="john";
        S.roll_no=2;
        S.ph=123456;
        S.addr="dno,street,village";
        System.out.println(S.name+" "+S.roll_no+" "+S.ph+" "+S.addr);
        Student S1=new Student();
        S1.name="sam";
        S1.roll_no=3;
        S1.ph=1298756;
        S1.addr="dno,street,village";
        System.out.println(S1.name+" "+S1.roll_no+" "+S1.ph+" "+S1.addr);
    }
}
class Student{
    String name;
    int roll_no,ph;
    String addr;
}