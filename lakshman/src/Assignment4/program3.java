package Assignment4;

class program3 {}

class member
{
    String name;
    int age;
    String phoneNumber;
    String address;
    int salary;

    void printSalary(){
        System.out.println(salary);
    }
}

class employee extends member
{
    String specializaton = "java";
    String department = "developer";

    public static void main(String[] args) {
        employee empobj = new employee();
        empobj.name = "lakshman";
        empobj.age = 25;
        empobj.phoneNumber = "8498957031";
        empobj.address = "rajahmundry";
        empobj.salary = 30000;
        System.out.println(empobj.name+"  "+empobj.age+"  "+empobj.specializaton+"  "+empobj.department+"  "+empobj.phoneNumber+"  "+empobj.address+"  "+empobj.salary);

    }
}

class manager extends member
{
    String specializaton = "advanced java";
    String department = "manager";

    public static void main(String[] args) {
        manager manobj = new manager();
        manobj.name = "bhaskar";
        manobj.age = 25;
        manobj.phoneNumber = "8235266368";
        manobj.address = "kakinada";
        manobj.salary = 50000;

        System.out.println(manobj.name+"  "+manobj.age+"  "+manobj.specializaton+"  "+manobj.department+"  "+manobj.phoneNumber+"  "+manobj.address+"  "+manobj.salary);
    }
}
