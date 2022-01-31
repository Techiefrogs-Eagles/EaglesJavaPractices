package Assignment4;

public class Employee extends Member{
    String Specialization="java";
    String Development="Developer";
    public static void main(String[] args) {
        Employee eobj=new Employee();
        eobj.Name="aaa";
        eobj.Age=20;
        eobj.Phno="123456789";
        eobj.Salary="2000$";
        eobj.Address="Atlanta";
        System.out.println(eobj.Name+" "+eobj.Address+"  "+eobj.Age+" "+eobj.Phno+ "  "+eobj.Salary);
    }

        

    }

