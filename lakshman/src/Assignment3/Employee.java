package Assignment3;

public class Employee 
{
    String name;
    int year;
    String address;

    public static void main(String[] args) 
    {
        System.out.println("Name     Year of Joining      Address");
        Employee employee1 = new Employee();
        employee1.name = "Robert";
        employee1.year = 1994;
        employee1.address = "64C-WallsStreet";
        System.out.println(employee1.name+"      "+employee1.year+"           "+employee1.address); 
        
        Employee employee2 = new Employee();
        employee2.name = "Sam";
        employee2.year = 2000;
        employee2.address = "68D-WallsStreet";
        System.out.println(employee2.name+"         "+employee2.year+"           "+employee2.address);

        Employee employee3 = new Employee();
        employee3.name = "John";
        employee3.year = 1999;
        employee3.address = "26B-WallsStreet";
        System.out.println(employee3.name+"        "+employee3.year+"           "+employee3.address);
    }
}
