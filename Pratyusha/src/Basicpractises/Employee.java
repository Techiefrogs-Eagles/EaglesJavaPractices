package Basicpractises;

public class Employee {
    int id;
    String Name;
    double Salary;

    void display(){
        System.out.println("-------------------------");
        System.out.println("id = "+id);
        System.out.println("Name = "+Name);
        System.out.println("Salary = "+Salary);
        System.out.println("-------------------------");
    }
}

class PersonalInformation{
    public static void main(String[] args) {
    
    Employee obj = new Employee();
    obj.id = 5;
    obj.Name =  "Srikshitha";
    obj.Salary = 52145.25;
    obj.display();

    }


}
