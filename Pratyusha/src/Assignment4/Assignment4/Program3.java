package Assignment4;

public class Program3 { }

class Member {
    String Name;
    int Age;
    String phoneNumber;
    String Address;
    int Salary;

    void printSalary() {
        System.out.println(Salary);
    }


}

class employee extends Member {
String specialization = "python";
String department = "Developer";
public static void main(String[] args) {
    employee empobj = new employee();
    empobj.Name = "Divya";
    empobj.Age = 20;
    empobj.phoneNumber = "7032042643";
    empobj.Address = "flat no 20 - New city";
    empobj.Salary = 20000;


    System.out.println(empobj.Name+"  "+empobj.Age+"  "+empobj.phoneNumber+"  "+empobj.Address+"  "+empobj.Salary+"  "+empobj.specialization+"  "+empobj.department);
}

}

class Manager extends Member {
    String specialization = "java";
    String department = "Data Science";

    public static void main(String[] args) {
        Manager manobj = new Manager();
        manobj.Name = "Jessy";
        manobj.Age = 30;
        manobj.phoneNumber = "7032031631";
        manobj.Address = " no 30 - Denmark";
        manobj.Salary = 50000;

System.out.println(manobj.Name+"  "+manobj.Age+"  "+manobj.phoneNumber+"  "+manobj.Address+"  "+manobj.Salary+"  "+manobj.specialization+"  "+manobj.department);



        
    }
}