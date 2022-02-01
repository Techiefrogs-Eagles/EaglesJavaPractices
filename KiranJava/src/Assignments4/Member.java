package Assignments4;

public class Member {
    String name,number,address;
    int age,salary;
    public void printSalary(){
        System.out.println(salary);
    }
}
class Employee extends Member{
    String special;
}
class Manager extends Member{
    String department;
}
class Q3{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="kiran";
        e.age=24;
        e.number="123456";
        e.address="abcd";
        e.salary=4567;
        e.special="cse";
        e.printSalary();
        Manager m=new Manager();
        m.salary=123;
        m.department="qwerty";
        m.printSalary();
        System.out.println(e.name+" "+e.address);
    }
}